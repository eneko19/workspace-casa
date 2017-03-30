package ejercicios;

import java.util.Arrays;

public class Ejercicio4 {

	/*
	 * 4.- Crea un array llamado notas con los siguientes valores: A continuación crea otro array llamado 
	 * primerasNotas cuyos valores sean los cuatro primeros de notas, y muestra sus valores. Utiliza el 
	 * método Arrays.copyOfRange(). Ojo al uso de índices por parte de este método.
	 */
	
	public static void main(String[] args) {

		int notas[] = {5, 8, 4, 9, 10, 8, 2, 4};
		int primerasNota[] = Arrays.copyOfRange(notas, 0, 4);
		
		System.out.println("Primeras notas");
		for (int i = 0; i < primerasNota.length; i++) {
			System.out.print(primerasNota[i] + " ");
		}
	}

}
