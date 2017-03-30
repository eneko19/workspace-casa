
import java.util.Scanner;

public class Ejercicio7 {

	static public void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Dime un número del 1 al 10");
		int numero = entrada.nextInt();
		
		if (numero == 7) {
			System.out.println("¡Felicidades, has acertado!");
		} else {
			System.out.println("Lo siento, has fallado.");
		}
	}
}
