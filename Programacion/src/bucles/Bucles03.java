package bucles;

public class Bucles03 {

	public static void main(String[] args) {
		//  Crea una aplicación que calcule una lista con las potencias de 3 menores que 12000. Haz que en
		// cada pasada del bucle se muestre el exponente y el valor de la potencia. Utiliza un bucle do-while.
		
		

		double exponente=0;
		double potencia=0;
		double base=3;


		do{
		System.out.println("Exponente: " + exponente + " Potencia: " + potencia);
		potencia=Math.pow(base, exponente);
		exponente++;
		}while(potencia<12000);




		}

		}