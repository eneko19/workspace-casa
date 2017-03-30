package arrays1;

public class Ejercicio16 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double temp[] = {15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6};
		double suma = 0;
		int mayor = 0;

		
		for (int i = 0; i < temp.length; i++) {
			suma = (temp[i] + suma);
			if(temp[i] > 12){
				mayor++;
			}
		}
		System.out.println(suma / temp.length);
		System.out.println("Temperaturas mayor a 12: " + mayor);
	}

}
		
