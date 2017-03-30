package instituto;

import auxiliar.Alumno;
import auxiliar.Grupo;

/**
 * La clase Instituto representa los datos de un Instituto, con sus alumnos y
 * grupos, así como las operaciones con ambos.
 * 
 * @author Eneko
 *
 */
public class Instituto {

	// Atributos

	private final int MAX_ALUMNOS = 30;
	private final int MAX_GRUPOS = 20;
	private Alumno alumnos[] = new Alumno[MAX_ALUMNOS];
	private Grupo grupos[] = new Grupo[MAX_GRUPOS];

	// Constructores

	/**
	 * Añade el alumno que se le pasa como argumento al array alumnos[].
	 * 
	 * @param alu
	 *            Alumno que hay que dar de alta en el instituto.
	 */
	public void addAlumno(Alumno alu) {

		// Comprobamos que no haya un alumno con ese número de expediente.
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumExpediente() == alu.getNumExpediente()) {
				System.out.println("Número de expediente repetido.");
				return;
			}
		}

		// Comprobamos que el grupo exista.
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] != null && grupos[i].getNumGrupo() == alu.getNumGrupo()) {
				System.out.println("No existe el grupo. Operación cancelada.");
				return;
			}
		}

		// Añadimos al alumno.
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alu;
				break;
			}
		}

	}

	/**
	 * 
	 * Elmina el alumno según el número de expediente que se le da
	 * 
	 * @param numExp
	 * 					numExp que hay que dar para eliminar el alumno
	 */
	
	public void delAlumno(int numExp) {

		int posicion = buscaAlumno(numExp);
		if (posicion != -1) {
			alumnos[posicion] = null;
		}

	}
	
	
	/**
	 * El método muestraAlumnos muestra los alumnos que hay registrados en un instituto
	 */
	
	public void muestraAlumnos() {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				System.out.println(alumnos[i].toString());
			}
		}
	}

	/**
	 * Devuelve el número de alumnos del instituto.
	 * 
	 * @return Número de alumnos del instituto.
	 */
	public int numAlumnos() {
		int suma = 0;

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				suma++;
			}
		}
		return suma;
	}
	
	/**
	 * recorre el array para sumar los grupos que hay en total
	 * 
	 * @return Devuelve la suma total  de grupos contados
	 */

	public int numGrupos() {
		int suma = 0;
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] != null) {
				suma++;
			}
		}
		return suma;
	}

	/**
	 * Busca si un alumno está matriculado en el centro, y devuelve su posición
	 * en el array alumnos[].
	 * 
	 * @param numExp
	 *            Número de expediente del alumno.
	 * @return Posición en el array alumnos del alumno que hemos 
	 * 		   recibido como
	 *         parámetro, o -1 si no se encuentra.
	 */
	public int buscaAlumno(int numExp) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumExpediente() == numExp) {
				return i;
			}
		}

		return -1;
	}
	
	/**
	 * Recorre el array para mostrar un grupo en concreto
	 */

	public void muestraGrupos() {
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] != null) {
				System.out.println(grupos[i].toString());
			}
		}
	}

	/**
	 * recorre el array alumnos para saber que alumnos hay en un grupo
	 * 
	 * @param numGrupo
	 * 					Número del Grupo
	 */
	
	public void muestraAlumnosGrupo(int numGrupo) {
		System.out.println("Exp.\tApellidos\tNombres\tGrupo");
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumGrupo() == numGrupo) {

				System.out.println(alumnos[i].toString());
			}
		}
		System.out.println();
	}
	
	/**
	 * Añada un grupo al array grupos si la posición es nula
	 * 
	 * @param grup
	 * 				grupo nuevo
	 * 				
	 */

	public void addGrupo(Grupo grup) {
		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] == null) {
				grupos[i] = grup;
				break;
			}
		}
	}
	
	/**
	 * 
	 * Elimina un grupo según del numGrupo dado
	 * 
	 * @param numGrupo
	 * 					Número de grupo
	 */

	public void delGrupo(int numGrupo) {

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumGrupo() == numGrupo) {
				System.out.println("No se puede eliminar el grupo. Hay alumnos matriculados.");
				return;
			}
		}

		int posicion = buscaGrupo(numGrupo);
		if (posicion != -1) {
			grupos[posicion] = null;
		}
	}
	
	/**
	 * Busca un grupo en el array grupos 
	 * 
	 * @param numGrupo
	 * 					número de grupo
	 * 
	 * @return
	 * 			Devuelve la posicion del array del grupo según el número de Grupo dado, si no lo encuentra
	 * 			devolverá -1
	 * 
	 */

	public int buscaGrupo(int numGrupo) {
		for (int i = 0; i < alumnos.length; i++) {
			if (grupos[i] != null && grupos[i].getNumGrupo() == numGrupo) {
				return i;
			}
		}

		return -1;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

}





