import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el precio de un producto");
		double precio = entrada.nextDouble();
		double suma = precio + 2;

		if (precio < 5) {
			System.out.println("Precio total = " + suma );
		}
		if (precio >= 5 ) {
			System.out.println("Precio total = " + precio);
		}

	}

}