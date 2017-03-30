
import java.util.Scanner;

public class Ejercicio8 {

	static public void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cómo se dice ordenador en inglés?");
		String nombre = entrada.nextLine();
		
		if(nombre.equals("computer")){
		    System.out.println("¡Felicidades!");
		} else {
			System.out.println("ERROR, no sabes inglés pero eres muy bueno equivocandote.");
			
		}
	}
}
