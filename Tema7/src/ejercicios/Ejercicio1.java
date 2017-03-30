package ejercicios;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {

		/*
		 * 1.- Crea un programa que almacene los siguientes precios en un array y lo muestre al final ordenado. 
		 *  Aprovecha para esto el método Arrays.sort(). 
		 */
		double precios [] =  {6.30, 3.50, 4.95, 2.90, 10, 12.30, 2.45, 4.90, 6.20, 7};
		
		Arrays.sort(precios);
		
		System.out.println("Array ordenado");
		for (int i = 0; i < precios.length; i++) {
			System.out.print(precios[i] + "  ");
		}
		
		
	}

}

