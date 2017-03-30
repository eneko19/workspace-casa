
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Dime tu contraseña");
		int contraseña = entrada.nextInt();
		
		if (contraseña == 1234){
			System.out.println("Acceso concedido");
		}
	}
	
}
