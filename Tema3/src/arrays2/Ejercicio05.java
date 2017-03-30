package arrays2;

public class Ejercicio05 {

	public static void main(String[] args){
		
		double temp [] = {15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6};
		int posMin = 0;
		int posMax = 0;
		
		for (int i = 0; i < temp.length; i++) {
			
			if(temp[i] < temp[posMin]){
				posMin = i;
			}
			if(temp[i] > temp[posMax]){
				posMax = i;
			}

		}
		System.out.println("tempoeratura maxima " + temp[posMax] + " posicion " + posMax);
		System.out.println("Temperatrira minima " + temp[posMin] + " posicion " + posMin);
		
		
	}
}
