
public class Carta {

	private int valor;
	private int palo;
	
	
	public Carta(int valor, int palo){
		this.valor = valor;
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getPalo(){
		
		return palo;
	}

	public void setPalo(int palo) {
		this.palo = palo;
	}
	
	public boolean compara(Carta otraCarta){
		if(valor == getValor() && palo == getPalo()){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		
	String palos = "palos";
		switch (palo) {
		 
        case 0:
        palos = "diamantes";
        break;
        case 1:
        	palos = "corazones";
        	break;
        case 2:
          palos = "picas";
            break;
        case 3:
            palos = "tréboles";
            break;
		}
		return "El valor es " + valor + " y el palo es " + palos;
	}
}
