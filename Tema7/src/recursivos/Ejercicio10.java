package recursivos;

public class Ejercicio10 {

	public static void main(String[] args) {

		int edades[] = {1, 3, 12, 10, 15, 89, 45, 23};

		System.out.println(multiplicar(edades, 6));
	}
	
	public static int multiplicar(int lista[], int n){
		
		
		if(n == 1){
			return lista[0];
		}else{
			return lista[n - 1] * multiplicar(lista, n-1);
		}
	}

}
