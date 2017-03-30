package arrays2;

import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double productos [] = new double [10];
		boolean preciosCorrectos = true;
		double suma = 0;
		
		for (int i = 0; i < productos.length; i++) {
			System.out.println("Precio" + (i+1));
			productos[i] = entrada.nextDouble();
			suma = productos[i] + suma;
		}
		int i = 0;
		while (i < productos.length && preciosCorrectos){
			if (productos[i] < 0){
				preciosCorrectos = false;
				System.out.println("Se ha encontrado un valor no váido en la posición " + i);
			}
			i++;
		}
		if(preciosCorrectos){
			System.out.println(suma);
		}
		
	}

}
