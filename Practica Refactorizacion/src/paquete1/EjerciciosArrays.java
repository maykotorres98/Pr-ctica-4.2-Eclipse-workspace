package paquete1;
import java.util.Arrays;
import java.util.List;
public class EjerciciosArrays {
	public static void main(String[] args) {
		int numAlumnos= 40;
		//vector notas
		Integer[] control = crearNotas(numAlumnos);
		//mayor nota de array control
		int minNota = obtenerMayorNotayMenor(control,1);
		//menor nota de array control
		int maxNota = obtenerMayorNotayMenor(control,2);
		//vector lista clase
		int[] listaClase = crearListaClaseyPracticas(numAlumnos,1);
        //Empezamos el uso de listas para facilitar la tarea de índices.
		List<Integer> notas = Arrays.asList(control);
		int indMinNota = notas.indexOf(minNota) + 1;
        int indMaxNota = notas.indexOf(maxNota) + 1;
        //Comprobamos el resultado del ejercicio   
        System.out.println("Mínimo es: " + minNota);
        System.out.println("Máximo es: " + maxNota);
        System.out.println("Indice del mínimo es : " + indMinNota);
        System.out.println("Indice del máximo es : " + indMaxNota);
        System.out.println("Lista de clase :" + Arrays.toString(listaClase));
        System.out.println("Array de Notas :" + notas);
      //vector practicas
        int[] practicas = crearListaClaseyPracticas(numAlumnos,2);
        float[] calificaciones = crearCalificaciones(control,practicas);
        System.out.println("Prácticas      :" + Arrays.toString(practicas));
        System.out.println("Calificaciones :" + Arrays.toString(calificaciones));
        float[] estadistica = estadistica(control,calificaciones,numAlumnos);
      //Aprobados y suspensos
        int [] aprobados =  aprobadossuspensos( numAlumnos, calificaciones,1);
        int [] suspensos =  aprobadossuspensos( numAlumnos, calificaciones,2);
        int countAprobados = contaraprobadossuspensos( numAlumnos, calificaciones,1);
        int countSuspensos = contaraprobadossuspensos( numAlumnos, calificaciones,2);
      System.out.println("Relación de aprobados por nº de lista: " + Arrays.toString(aprobados));
      System.out.println("Relación de suspensos por nº de lista: " + Arrays.toString(suspensos));
      //Resumen de aprobados y suspensos
      int[] a = resumenaprobadossuspensos(countAprobados,aprobados,countSuspensos,suspensos,1);
      int[] s = resumenaprobadossuspensos(countAprobados,aprobados,countSuspensos,suspensos,2);
      System.out.println("Resumen  de aprobados por nº de lista: " 
              + Arrays.toString(a));
      System.out.println("Resumen  de aprobados por nº de lista: " 
              + Arrays.toString(s));
      /*6. Suponer un vector de Calificaciones de tamaño 40 
      (máximo de alumnos por clase), pero que solo almacena las
      notas de 31 alumnos. Realizar un programa que permita insertar en
      la posición 4 del vector la calificación de un nuevo 
      alumno en clase al que supuestamente le corresponde como nota un 6.*/
      double[] calif = crearCalificaciones2(numAlumnos);
      System.out.println("Nota antigua alumno nº4: " + calif[3]); 
      calif[3] = 6;
      System.out.println("Nota nueva   alumno nº4: " + calif[3]);
       
	}
	public static Integer[] crearNotas(int numAlumnos) {
		Integer[] control = new Integer[numAlumnos];
		//Genera notas random entre 1 y 10
        for(int i=0; i < control.length; i++){
            control[i] = (int)(Math.random()*11);
        }
		return control;
	}
	
	public static  int  obtenerMayorNotayMenor(Integer[] control,int numero) {
		int maxNota = 0;
		int minNota = 11;//11 por que siempre va ver un numero menor a 11 por que el array es de 0 a 10
		for(int i = 0;i<control.length;i++) {
			//calculamos mayor nota
        	if(control[i] > maxNota) {
        		maxNota = control[i];
        	}
        	// calculamos menor nota
        	if(control[i] < minNota) {
        					minNota = control[i];
        	}
		}if(numero == 1) {
			return minNota;
		}else {
			return maxNota;
		}
	}
	
	public static int[] crearListaClaseyPracticas(int numAlumnos,int numero) {	
		int[] listaClase = new int[numAlumnos];
		int[] practicas  = new int[numAlumnos];
        for(int i=0; i < listaClase.length; i++){
    		//inicializa una secuencia ascendente 1 hasta largo de array 
        	listaClase[i] = i+1;
    		//Genera notas random entre 1 y 10
            practicas[i] = (int)(Math.random()*11);

        }
        if(numero == 1) {
        	return listaClase;
        }else {
        	return practicas;
        }
	}
	
	public static float[] crearCalificaciones(Integer[] control,int[] practicas) {
		float[] calificaciones = new float[control.length];
		  for(int i = 0; i<control.length; i++){
			  calificaciones[i] = (((float) control[i]  + (float) practicas[i]) / 2);
	        }
		return calificaciones;
	}
	public static float[] estadistica(Integer[] control,float[] calificaciones,int numAlumnos) {
		float[] estadistica = new float[10];
		for (int i=0; i<10; i++){
            float count = 0;
            for (int j=0; j<control.length; j++){
                if ((i < calificaciones[j]) && ((i+1) >= calificaciones[j] )) {
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
		return estadistica;
	}
	public static int[] aprobadossuspensos(int numAlumnos,float[] calificaciones,int numero) {
		   //Aprobados y suspensos
        int[] aprobados = new int[numAlumnos];
        int[] suspensos = new int[numAlumnos];
        for (int i=0; i<numAlumnos; i++){
            if (calificaciones[i] < 5){
                aprobados[i] = i +1 ;
            }else{ 
                suspensos[i] = i + 1;
            }
        } 
        if(numero==1) {
        	return aprobados;
        }else {
        	return suspensos;
        }
	}
	public static int contaraprobadossuspensos(int numAlumnos,float[] calificaciones,int numero) {
		   //Aprobados y suspensos
     int[] aprobados = new int[numAlumnos];
     int[] suspensos = new int[numAlumnos];
     int countAprobados = 0;
     int countSuspensos = 0;
     for (int i=0; i<numAlumnos; i++){
         if (calificaciones[i] < 5){
             aprobados[i] = i;
             countAprobados += 1;
         }else{ 
             suspensos[i] = i;
             countSuspensos += 1;
         }
     } 
     if(numero==1) {
     	return countAprobados;
     }else {
     	return countSuspensos;
     }
	}
	public static int[] resumenaprobadossuspensos(int countAprobados,int[] aprobados, int countSuspensos,int[] suspensos,int numero) {
		 //Resumen de aprobados y suspensos
        int i = 0;
        int x = 0;
        int y =0;
        int[] a = new int[countAprobados];
        int[] s = new int[countSuspensos];
        while (i < aprobados.length || i < suspensos.length) {
            // Procesar aprobados
            if (i < aprobados.length && aprobados[i] != 0) {
                a[x] = aprobados[i];
                x++;
            }
            // Procesar suspensos
            if (i < suspensos.length && suspensos[i] != 0) {
                s[y] = suspensos[i];
                y++;
            }   
            i++;
        }
        if(numero == 1) {
        	return a;
        }else {
        	return s;
        }
	}
	public static double[] crearCalificaciones2(int numAlumnos) {
			double[] calif = new double[numAlumnos];
			for(int j = 0;j<31;j++) {
				calif[j] = (int)(Math.random()*11);
			}
			return calif;
	}
}
