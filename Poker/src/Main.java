
public class Main {

	public static void main(String[] args) {

		Carta c1 = new Carta(6,1);
		
		Carta c2 = new Carta(7,0);
		System.out.println(c1.toString());
		
		System.out.println(c1.compara(c2));
		
	}

}
