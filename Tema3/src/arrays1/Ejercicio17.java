package arrays1;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double precios[] = new double [10];
		double total = 0;
		int mayor = 0;
		
		for (int i = 0; i < precios.length; i++) {
			System.out.println("Dime el precio del producto " + (i+1)); 
			precios[i] = entrada.nextDouble();
			total = precios[i] + total;
			if(precios[i] > 10){
				mayor++;
			}
			
		}
		
		System.out.println("EL precio total a pagar es " + total + ", y tienes " + mayor + " productos que cuestan mas de 10 euros.");

	}

}
