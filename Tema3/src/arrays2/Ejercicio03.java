package arrays2;

import java.util.*;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		String nombres[] = new String [10];
		boolean nombreEncontrado = false;
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Nombre");
			nombres[i] = entrada.nextLine();
			if(nombres[i].equals("nadie")){
				break;
			}
		}
			
		int i = 0;
		while (i < nombres.length && !nombreEncontrado && !nombres[i].equals("nadie")){
			System.out.println(nombres[i]);
			if(nombres[i].equals("calderon")){
				nombreEncontrado = true;
			}
			i++;
		}
		if(nombreEncontrado){
			System.out.println("de la barca");
		}else{
			System.out.println("nombre no encotrado");
		}
		
	}

	}
