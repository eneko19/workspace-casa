package arrays1;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String matriculas [] = new String [100];
		
		for (int i = 0; i < matriculas.length; i++) {
			matriculas[i] = "sinmatricula";
		}
		
		for (int i = 0; i < matriculas.length; i++) {
			System.out.println(i + " " + matriculas[i]);
		}
	}

}
