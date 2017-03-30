package arrays2;

import java.util.*;

public class Ejercicio10 {

	public static void main(String[] args){
	
		Scanner entrada = new Scanner (System.in);
		
		int temp[] = new int [8];
		int posMin = 0;
		int aux = 0;
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println("Temperatura");
			temp[i] = entrada.nextInt();
		}
		
		for (int i = 0; i <temp.length; i++) {
			posMin = i;
			for (int j = i+1; j < temp.length; j++) {
				if(temp[j] < temp[posMin]){
					posMin = j;
				}
			}
			
			aux = temp[i];
			temp[i] = temp[posMin];
			temp[posMin] = aux;
		}
		
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		System.out.println("Temp menor " + temp[0]);
		System.out.println("Temp mayor " + temp[temp.length -1]);
		
	}
}
