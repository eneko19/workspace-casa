package arrays2;

public class Ejercicio02 {

	public static void main(String[] args) {

		double estaturas[] = {1.89, 1.53, 1.65, 1.90, 1.90, 1.58, 1.73, 1.84, 1.68, 1.92};
		double mayor = 0;
		
		for (int i = 0; i < estaturas.length; i++) {
			if(estaturas[i] > 1.90){
				System.out.println("Alguna persona es mayor a 1.90");
			}
		}
	}

}
