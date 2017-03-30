package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	/*
	 * 5.- Escribe una aplicación que rellene dos arrays con cinco nombres de personas cada uno 
	 * (preguntándolos desde consola). A continuación indicará si son idénticos 
	 * (con los mismos valores y mismas posiciones) usando el método Arrays.equals().
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		String nombres[] = new String [5];
		String nombres1[] = new String [5];
		
		System.out.println("Array 1");
		for (int i = 0; i < nombres1.length; i++) {
			System.out.println("Nombre?");
			String nombre = entrada.nextLine();
			nombres[i]= nombre;
		}
		
		System.out.println("Array 2");
		for (int i = 0; i < nombres1.length; i++) {
			System.out.println("Nombre?");
			String nombre = entrada.nextLine();
			nombres1[i]= nombre;
		}
		
		
		if(Arrays.equals(nombres, nombres1) == true){
		System.out.println("Los arrays son idénticos");
		}else{
			System.out.println("Los arrays no son idénticos.");
		}
	}

}
