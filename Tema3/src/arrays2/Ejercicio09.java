package arrays2;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int precios [] = {43, 58, 44, 62, 80, 15, 15, 10, 90, 56};
		int posMin = 0;
		int aux;
		
		for (int i = 0; i < precios.length; i++) {
			posMin = i;
			for (int j = i+1; j < precios.length; j++) {
				if(precios[j] < precios[posMin]){
					posMin = j;
				}
			}
			
			aux = precios[i];
			precios[i] = precios[posMin];
			precios[posMin] = aux;
		}
		for (int i = 0; i < precios.length; i++) {
			System.out.print(precios[i] + " ");
			
		}
	}

}
