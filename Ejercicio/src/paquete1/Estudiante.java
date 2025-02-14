package paquete1;

public class Estudiante extends Persona {

	

	private double nota;

	public Estudiante(String nombre, int edad, double nota) {
		super(nombre, edad);
		this.nota = nota;
	}
	
	
	public void mostrarNota() {
		System.out.println("La nota del estudiante es: "+this.nota);
		
	}
	
}
