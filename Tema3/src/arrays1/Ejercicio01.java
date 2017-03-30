package arrays1;

public class Ejercicio01 {

	public static void main(String[] args) {
		// 

		String estaciones [] = {"Primavera", "Verano", "Otoño", "Invierno" };
		
		System.out.println("Estaciones");
		System.out.println("=====================");
		for (int i = 0; i < estaciones.length; i++) {
			System.out.print((i+1) + estaciones[i] + " ");
		}
	}

}
