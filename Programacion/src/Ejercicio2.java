
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Ejercicio 2
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("¿Cuál es el precio del producto?");
		double precio = entrada.nextDouble();
		
		if (precio >= 80) {
			double descuento = (precio * 10) / 100;
			System.out.println("El precio total es " + (precio - descuento + "."));
		}
			
			
		}

}
