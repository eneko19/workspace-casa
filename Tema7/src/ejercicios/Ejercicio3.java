package ejercicios;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio3 {

	/*
	 * 3.- Añade al final del ejercicio 2 una instrucción que muestre los valores del array usando el método Arrays.toString(), 
	 * en lugar de un bucle.
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		double precios [] =  {6.30, 3.50, 4.95, 2.90, 10, 12.30, 2.45, 4.90, 6.20, 7};
		
		Arrays.sort(precios);
		
		System.out.println("Array ordenado");
		for (int i = 0; i < precios.length; i++) {
			System.out.print(precios[i] + "  ");
		}
		System.out.println();
		double precio;

		System.out.println("\nDime un precio de la lista:");
		precio = entrada.nextDouble();
		
		int posicion = Arrays.binarySearch(precios, precio);
		
		if(posicion >= 0) {
			System.out.println("Posición: " + posicion);
		}else {
			System.out.println("No se ha encontrado el número");
		}	
		
		System.out.println(Arrays.toString(precios));
	
	}

}