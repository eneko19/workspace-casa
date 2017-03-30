
public class Taller {

	private final int MAX_LAVADORAS = 20;
	private Lavadora lavadoras[] = new Lavadora[MAX_LAVADORAS];
	
	// Metodos
	
	public void listaLavadoras(){
		for (int i = 0; i < lavadoras.length; i++) {
			if(lavadoras[i] != null){
				System.out.println(lavadoras[i].toString());
			}
		}
	}
	
	public void addLavadora(Lavadora lav){
		
		for (int i = 0; i < lavadoras.length; i++) {
			if(lavadoras[i] == null) {
				lavadoras[i] = lav;
				break;
			}
		}
	}
	
	public int buscaLavadora(int id){
		for (int i = 0; i < lavadoras.length; i++) {
			if(lavadoras[i] != null && lavadoras[i].getId() == id){
				return i;
			}
		}
		return -1;
	}
	
	public void borraLavadora(int id){
		int num = buscaLavadora(id);
		for (int i = 0; i < lavadoras.length; i++) {
			if(lavadoras[i] == lavadoras[num]){
				lavadoras[i] = null;
			}
		}
	}
}
