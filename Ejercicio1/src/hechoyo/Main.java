package hechoyo;

public class Main {

	public static void main(String[] args) {
		Inventario inventario = new Inventario();
		inventario.agregarProducto();
        System.out.println("Inventario antes de eliminar:\n");
		inventario.mostrarInformacion();
		System.out.println("-".repeat(150));

        inventario.eliminarProducto();
        System.out.println("Inventario después de eliminar:\n");
        inventario.mostrarInformacion();
	}

}
