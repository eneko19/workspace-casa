package auxiliar;

import java.util.*;

public class Alumno {

	private int numExpediente;
	private String apellidos;
	private String nombre;
	private Grupo grupo;
	
	// Constructores
	public Alumno() {
		
	}

	public Alumno(int numExpediente,String apellidos, String nombre,Grupo grupo) {
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.grupo = grupo;
	}
	
	public String toString(){
		return "Nº de expediente: " + numExpediente + "\nApellidos: " + apellidos + "\nNombre: " + nombre + "\nGrupo: " + grupo.toString();
	}
	public void leeDatos(){
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Número de expediente?");
		numExpediente = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Apellidos?");
		apellidos = entrada.nextLine();
		
		System.out.println("Nombre?");
		nombre = entrada.nextLine();
		
		System.out.println("Grupo?");
		grupo = new Grupo();
		grupo.leeDatos();
	}

	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}
	
}
