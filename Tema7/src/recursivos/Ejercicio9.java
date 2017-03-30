package recursivos;

public class Ejercicio9 {

	public static void main(String[] args) {

		int edades[] = { 12, 10, 15, 89, 45, 23};

		System.out.println(sumar(edades, 6));
	}
	
	public static int sumar(int lista[], int n){
		
		
		if(n == 1){
			return lista[0];
		}else{
			return lista[n - 1] + sumar(lista, n-1);
		}
	}

}
