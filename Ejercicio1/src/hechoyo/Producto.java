package hechoyo;

import java.util.ArrayList;

public class Producto {

		private String nombre;
		private double precio;
		private int cantidad;
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		public int getCantidad() {
			return cantidad;
		}
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		public Producto(String nombre, double precio, int cantidad) {
			super();
			this.nombre = nombre;
			this.precio = precio;
			this.cantidad = cantidad;
		}
		
		
		public void mostraInformacionP() {
			System.out.println("El nombre del producto es "+this.nombre);
			System.out.println("El precio del producto es "+this.precio);
			System.out.println("La cantidad del producto es "+this.cantidad);

		}
	
		
}
