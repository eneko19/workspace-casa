package arrays1;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int potencias[] = new int[20];
		
		for (int i = 0; i < potencias.length; i++) {
			potencias[i] = (int)Math.pow(2, i);
		}
		
	for (int i = 0; i < potencias.length; i++) {
		System.out.println(potencias[i]);
	}
	}

}
