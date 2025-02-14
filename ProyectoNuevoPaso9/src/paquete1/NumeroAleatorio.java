package paquete1;
import java.util.Random;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Random rand = new Random();
        
        // Generar un número aleatorio entre 1 y 100
        int numeroAleatorio = rand.nextInt(101);
        
        // Imprimir el número aleatorio
        System.out.println("El número aleatorio generado es: " + numeroAleatorio);
    }
}
