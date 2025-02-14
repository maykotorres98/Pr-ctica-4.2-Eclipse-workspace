package paquete1;

public class Persona {
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
		
	public void mostrarInformacion() {
		System.out.println("El nombre de la persona es: "+this.nombre);
		System.out.println("La edad de la persona es: "+this.edad);
		
	}
}
