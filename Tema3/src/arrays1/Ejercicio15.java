package arrays1;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double temp[] = {15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6};
		double suma = 0;
		
		for (int i = 0; i < temp.length; i++) {
			suma = (temp[i] + suma);
		}
		System.out.println(suma / temp.length);
	}

}
