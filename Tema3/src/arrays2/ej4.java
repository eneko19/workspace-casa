package arrays2;

import java.util.*;

public class ej4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		int productos [] = new int [10];
		boolean preciosCorrectos = true;
		int suma = 0;
		
		for (int i = 0; i < productos.length; i++) {
			System.out.println("Producto");
			productos[i] = entrada.nextInt();
			suma = productos[i] + suma;
			}

		int i = 0;
		while(i < productos.length && preciosCorrectos){
			if(productos[i] < 0){
				preciosCorrectos = false;
				System.out.println("Se ha encontrado un valor no válido en la posición " + i);

			}
			i++;
		}
		if (preciosCorrectos){
			System.out.println(suma);
		}
	}

}
