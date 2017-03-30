package auxiliar;

import java.util.Scanner;
/**
 * La clase Grupo representa los datos de un grupo con sus alumnos, 
 * así como sus operaciones.
 * @author Eneko
 */

public class Grupo {

	// Atributos
	private int numGrupo;
	private String nivel;
	private int curso;
	private String clase;

	// Constructores
/**
 * Constructor para dejar un objeto vacío.
 * 
 */
	public Grupo() {

	}

	/**
	 * Constructor para poner las variables dentro del constructor
	 * @param numGrupo 
	 * 				Es el número del grupo
	 * @param nivel
	 * 				El nivel será ESO, BACHILLERATO, FP, ...
	 * @param curso
	 * 				El curso será 1, 2, 3, ...
	 * @param clase
	 * 				La clase será A, B, C, ...
	 */
	public Grupo(int numGrupo, String nivel, int curso, String clase) {
		this.numGrupo = numGrupo;
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}

	// Métodos
	/**
	 * @return Devuelve los datos del grupo
	 */
	public String toString() {
		return numGrupo + "\t" + nivel + "\t" + curso + "\t" + clase;
	}
	
/**
 * Lee los datos del grupo por consola
 * 
 */
	public void leeDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Número de Grupo?");
		numGrupo = entrada.nextInt();

		entrada.nextLine();

		System.out.println("¿Nivel?");
		nivel = entrada.nextLine();

		System.out.println("¿Curso?");
		curso = entrada.nextInt();

		entrada.nextLine();

		System.out.println("¿Clase?");
		clase = entrada.nextLine();
	}

	public int getNumGrupo() {
		return numGrupo;
	}

}