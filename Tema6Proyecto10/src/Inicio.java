
public class Inicio {

	public static void main(String[] args) {

		Motor m1 = new Motor("Samsung","A1");
		Motor m2 = new Motor("CORSAIR","A2");
		
		Lavadora l1 = new Lavadora(1,m1,"Samsung",450);
		Lavadora l2 = new Lavadora(2,m1, "LG",500);
		Lavadora l3 = new Lavadora(3,m2,"ASUS",225);

		Taller t1 = new Taller();
		
		t1.addLavadora(l1);
		t1.addLavadora(l2);
		t1.addLavadora(l3);
		
		System.out.println("La posición de la lavadora con id 3 es: " + t1.buscaLavadora(3));
		System.out.println();
		
		t1.borraLavadora(2);
		
		t1.listaLavadoras();
	}

}
