
public class Motor {

	private String fabricante;
	private String modelo;
	
	public Motor(String fabricante, String modelo){
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	

}
