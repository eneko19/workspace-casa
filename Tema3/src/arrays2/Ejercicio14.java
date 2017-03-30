package arrays2;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		String precios [][] = {
					{"Tables Samsung", "120"},
					{"Móvil Sony", "115"},
					{"Ipad Mini", "290"},
					{"móvil HTC", "95"},					
		};
		int suma = 0;
		int posMin = 0;
		int posMax = 0;

		System.out.println("Articulos");
		System.out.println("===================");
		for (int i = 0; i < precios.length; i++) {
			System.out.println(precios[i][0] + "\t" + precios[i][1]);
			suma = Integer.parseInt(precios[i][1]) + suma;
			if (Integer.parseInt(precios[i][1]) < Integer.parseInt(precios[posMin][1])){
				posMin = i;
			}
			if (Integer.parseInt(precios[i][1]) > Integer.parseInt(precios[posMax][1])){
				posMax = i;
			}
			
		}
		
		System.out.println("Total: " + suma + " €");
		System.out.println("Menor precio " + precios[posMin][1]);
		System.out.println("Mayor precio " + precios[posMax][1]);
	}

}
