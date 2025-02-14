package hechoyo;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
	
	Scanner teclado = new Scanner(System.in);
	ArrayList<Producto> productos = new ArrayList<>();
	public void mostrarInformacion() {
		int contador = 1;
		for(Producto e: productos) {
			if(contador >1) {
				System.out.println("-".repeat(150));
			}
			System.out.println("La informacion del producto "+contador+" es:");
			e.mostraInformacionP();
			contador++;
			
		}
	}
	
	public void agregarProducto() {
		System.out.println("Dime la cantidad de productos a añadir: ");
		int cantidadP = teclado.nextInt();

		for(int i = 0;i<cantidadP;i++){	
			if(i>0) {
				System.out.println("-".repeat(150));
			}
			System.out.println("Dime la informacion del producto "+ (i+1));
		System.out.println("Dime el nombre del producto a añadir: ");
		String nombre = teclado.next();
		System.out.println("Dime el precio del producto en formato 0.0: ");
		double precio = teclado.nextDouble();
		System.out.println("Dime la cantidad del producto: ");
		int cantidad = teclado.nextInt();
		
		productos.add(new Producto(nombre,precio,cantidad));
		
		}
		System.out.println("Producto agregado correctamente:");
		System.out.println("-".repeat(150));

	}
	
	public void eliminarProducto() {
		
		System.out.println("Dime el producto a elminar: ");
		String productoEliminar = teclado.next();

		for(Producto e:productos) {
			if(e.getNombre().equalsIgnoreCase(productoEliminar)){
                productos.remove(e);	
                System.out.println("Producto eliminado exitosamente.");
                return;  
             }
			
		}
        System.out.println("Producto no encontrado en el inventario.");
	}
	
	
	
	
	

}
