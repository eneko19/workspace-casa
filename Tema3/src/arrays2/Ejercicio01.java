package arrays2;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int edades[] = {20, 25, 30, 28, 39, 42, 30,  29, 28, 21, 3, 55, 20, 19};
		boolean edadEncontrada = false;
		
		int i = 0;
		while(!edadEncontrada && i < edades.length){
			
			if(edades[i] == 35){
				System.out.println("Localizada persona de 35 años");
				edadEncontrada = true;
			}
			i++;
		}
	}

}
