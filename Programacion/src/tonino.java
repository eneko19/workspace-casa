import java.util.Scanner;

public class tonino {

	public static void main(String[] args) {
		// Tonino maricon
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Voy a jugar una partida");
		
		System.out.println("¿Contigo o sin tí?");
		String resp = entrada.nextLine();
		
		if (resp.equals("contigo")){
			System.out.println("Va te espero");
		} else{
			System.out.println("Pues le doy");
		}
	}

}
