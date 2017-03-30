package auxiliar;

import java.util.*;

public class Grupo {

	// Variables
	private String nivel;
	private int curso;
	private String clase;
	
	// Constructores
	public Grupo(){
		
	}
	public Grupo(String nivel, int curso, String clase){
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;	
	}
	
	// Métodos
	public String toString(){
		return "El nivel del grupo es " + nivel + " con curso " + curso + " y clase " + clase;
	}
	
	public void leeDatos(){
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("nivel?");
		nivel = entrada.nextLine();
		
		System.out.println("Curso?");
		curso = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Clase?");
		clase = entrada.nextLine();
	}
	
}
