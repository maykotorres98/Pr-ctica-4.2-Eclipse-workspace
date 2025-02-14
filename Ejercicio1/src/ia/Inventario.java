package ia;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(String nombre) {
        productos.removeIf(producto -> producto.getNombre().equalsIgnoreCase(nombre));
    }

    public void mostrarInventario() {
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
        }
    }

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Producto producto1 = new Producto("Manzana", 0.50);
        Producto producto2 = new Producto("Banana", 0.30);

        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);

        System.out.println("Inventario antes de eliminar:");
        inventario.mostrarInventario();

        inventario.eliminarProducto("Manzana");

        System.out.println("Inventario después de eliminar:");
        inventario.mostrarInventario();
    }
}
