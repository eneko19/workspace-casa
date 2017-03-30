
public class Lavadora {

	private int id;
	private Motor motor;
	private String marca;
	private float precio;
	private int iva = 21 / 100;

	// Constructores
	public Lavadora(int id, Motor motor, String marca, float precio) {
		this.id = id;
		this.motor = motor;
		this.marca = marca;
		this.precio = precio;
	}
	
	// Metodos
	public String toString(){ 
		return "Código: " + id + ", Motor: " + motor.getFabricante()+" " + motor.getModelo() + ", Marca: " + marca + ", Precio: " + precio;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
