package arrays2;

import java.util.*;

public class Ejericio06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		int votos[] = new int [6];
		int posMin = 0;
		int posMax = 0;
		
		for (int i = 0; i < votos.length; i++) {
			System.out.println("Votos del partido " + i);
			votos[i] = entrada.nextInt();
			
			if (votos[i] < votos[posMin]){
			posMin = i;	
			}
			if (votos[i] > votos[posMax]){
				posMax = i;	
			}
		}
		System.out.println("El menor número de votos es " + votos[posMin] + " y la posición es " + posMin);
		System.out.println("El mayore número de votos es " + votos[posMax] + " y la posición es " + posMax);

		
	}

}
