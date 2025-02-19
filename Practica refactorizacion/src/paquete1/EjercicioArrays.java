package paquete1;
import java.util.Arrays;
import java.util.List;
class Resultado{
	private Integer[] control ;
	private int minNota;
	private int maxNota;
	private int[] listaClase;
	private int[] Practicas;
	private float[] calificaciones;
	private int[] aprobados;
	private int[] suspensos;
	private int countAprobados;
	private int countSuspensos;
	private double[] calif;
	public Resultado(Integer[] control,int minNota,int maxNota,int[] listaClase,int[] Practicas,float[] calificaciones,int[]aprobados,int[]suspensos,int countAprobados,int countSuspensos,double[] calif) {
		this.control = control;
		this.minNota = minNota;
		this.maxNota = maxNota;
		this.listaClase = listaClase;
		this.Practicas = Practicas;
		this.calificaciones = calificaciones;
		this.aprobados = aprobados;
		this.suspensos = suspensos;
		this.countAprobados = countAprobados;
		this.countSuspensos = countSuspensos;
		this.calif = calif;
	}
	public Integer[] getControl() {
		return control;
	}
	public int getminNota() {
		return minNota;
	}
	public int getmaxNota() {
		return maxNota;
	}
	public int[] getlistClase() {
		return listaClase;
	}
	public int[] getPracticas() {
		return Practicas;
	}
	public float[] getCalificaciones() {
		return calificaciones;
	}
	public int[] getAprobados() {
		return aprobados;
	}
	public int[] getSuspensos() {
		return suspensos;
	}
	public int getCountAprobados() {
		return countAprobados;
	}
	public int getCountSuspensos() {
		return countSuspensos;
	}
	public double[] calif() {
		return calif;
	}
	public Resultado() {
	}	
}
public class EjercicioArrays {
	public static void main(String[] args) {
		int numAlumnos = 40;
		Resultado resultado = metodo1(numAlumnos);
		Integer[] control = resultado.getControl();
		int minNota = resultado.getminNota();
		//maxima nota
		int maxNota = resultado.getmaxNota();
        //creamos una lista de los alumnos de la clase
		int[] listaClase = resultado.getlistClase();
        //Empezamos el uso de listas para facilitar la tarea de índices.
		List<Integer> notas = Arrays.asList(control);
		int indMinNota = notas.indexOf(minNota)+1;
		int indMaxNota = notas.indexOf(maxNota)+1;
		
		//Comprobamos el resultado del ejercicio   
        System.out.println("Mínimo es: " + minNota);
        System.out.println("Máximo es: " + maxNota);
        System.out.println("Indice del mínimo es : " + indMinNota);
        System.out.println("Indice del máximo es : " + indMaxNota);
        System.out.println("Lista de clase :" + Arrays.toString(listaClase));
        System.out.println("Array de Notas :" + notas);
		//creamos vectro practicas
		int[]  practicas = resultado.getPracticas();
        //creamos vector calificaciones
		float[] calificaciones = resultado.getCalificaciones();
        
		 System.out.println("Prácticas      :" + Arrays.toString(practicas));
	     System.out.println("Calificaciones :" + Arrays.toString(calificaciones));
		
		float[] estadistica = new float[10];
	     for (int i=0; i<10; i++){
	            float count = 0;
	            //no se utiliza
	            //float sum = 0;
	            for (int j=0; j<control.length; j++){
	                if ((i < calificaciones[j]) && ((i+1) >= calificaciones[j] )) {
	                    //sum += calificaciones[j];
	                    count += 1;
	                }
	            }
	            if (count != 0){
	                estadistica[i] = ( (float)count / numAlumnos);
	            }else{ estadistica[i] = 0;}
	            double sol = (Math.round(estadistica[i] * 10000.0)) / 100.0;
	            System.out.println("Estadística nota tramo <=" 
	                + (i+1) + " = " 
	                + sol + "%");
	        }
    //aprobados suspensos y contarlos 
        int[] aprobados = resultado.getAprobados();
        int[] suspensos = resultado.getSuspensos();
        int countAprobados = resultado.getCountAprobados();
        int countSuspensos = resultado.getCountSuspensos();
        
        
        System.out.println("Relación de aprobados por nº de lista: " + Arrays.toString(aprobados));
        System.out.println("Relación de suspensos por nº de lista: " + Arrays.toString(suspensos));
	
	
	//resumen de aprobados y suspensos
        int i = 0;
        int x = 0;
        int[] a = new int[countAprobados];
        int[] s = new int[countSuspensos];
        while(i < aprobados.length){
            if(aprobados[i] != 0){
                a[x] = aprobados[i];
                i++;
                x++;
            }else{ i++; }
        }
        
        i = x = 0;
        while(i < suspensos.length){
            if(suspensos[i] != 0){
                s[x] = suspensos[i];
                i++;
                x++;
            }else{ i++; }
        }
        System.out.println("Resumen  de aprobados por nº de lista: " + Arrays.toString(a));
        System.out.println("Resumen  de aprobados por nº de lista: " + Arrays.toString(s));
        
        
        /*6. Suponer un vector de Calificaciones de tamaño 40 
        (máximo de alumnos por clase), pero que solo almacena las
        notas de 31 alumnos. Realizar un programa que permita insertar en
        la posición 4 del vector la calificación de un nuevo 
        alumno en clase al que supuestamente le corresponde como nota un 6.*/
        
        double[] calif = resultado.calif();
        
        System.out.println("Nota antigua alumno nº4: " + calif[3]); 
        calif[3] = 6;
        System.out.println("Nota nueva   alumno nº4: " + calif[3]);
        
	
	}
	public static Resultado metodo1(int numAlumnos){
		
		Integer[] control = new Integer[numAlumnos];
		
		int minNota = 11;
		
		int maxNota = 0;
		
		int[] listaClase = new int[numAlumnos];
		
		int[] practicas = new  int[numAlumnos];
		
		float[] calificaciones = new float[numAlumnos];
		
		int[] aprobados = new int[numAlumnos];
		
		int[] suspensos = new int[numAlumnos];
		
		int countAprobados = 0;
		
		int countSuspensos = 0;
		
		double[] calif = new double[numAlumnos];
		
		for(int i = 0;i<control.length;i++) {
			
			//notas random 
			control[i] = (int)(Math.random()*11);
			
			//maxima nota
			if(control[i]>maxNota){maxNota = control[i];}
			
			//menor nota
			if(control[i] <minNota) {minNota = control[i];}
			
			//listaclase
			listaClase[i] = i+1;
			
			//creamos el array de notas "practicas";
			practicas[i] = (int)(Math.random()*11);
			
			//creamos array calificaciones
			
			 calificaciones[i] = (((float) control[i] + (float) practicas[i]) / 2);
			
			//array aprobados y suspensos y contarlos
			 if(calificaciones[i] < 5) {
	            	aprobados[i] = i;
	            	countAprobados +=1;
	         }else {
	            	suspensos[i] = i;
	                countSuspensos += 1;
	         }
			 if(i<31) {
	            	calif[i] =(int)(Math.random()*11);
			 }
		}
		return new Resultado(control,minNota,maxNota,listaClase,practicas,calificaciones,aprobados,suspensos,countAprobados,countSuspensos,calif);
		
		
		
	}
}