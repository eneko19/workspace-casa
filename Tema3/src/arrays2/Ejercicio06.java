package arrays2;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		int esp [] = {2000000, 2500000, 3100000, 3000000, 1200000, 1800000, 2050000};
		int posMin = 0;
		int posMax = 0;
		for (int i = 0; i < esp.length; i++) {
			if(esp[i] < esp[posMin]){
				posMin = i;
			}
			if (esp[i] > esp[posMax]){
				posMax = i;
			}
			
		}
		System.out.println("Máximo espectadores " + esp[posMax]);
		System.out.println("Mínimo espectadores " + esp[posMin]);

	}

}
