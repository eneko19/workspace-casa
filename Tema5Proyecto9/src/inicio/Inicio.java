package inicio;

import auxiliar.Alumno;
import auxiliar.Grupo;
import instituto.Instituto;

public class Inicio {

	public static void main(String[] args) {
		
		Grupo g1 = new Grupo();
		g1.setNivel("ESO");
		g1.setCurso(1);
		g1.setClase("A");
		System.out.println("Grupo 1");
		System.out.println(g1.toString());
		System.out.println();
		
		Alumno a1 = new Alumno();
		a1.setNumExpediente(1);
		a1.setApellidos("Gallego Gomez");
		a1.setNombre("Eneko");
		a1.setGrupo(g1);
		
		Alumno a2 = new Alumno();
		a1.setNumExpediente(2);
		a1.setApellidos("Fernandez");
		a1.setNombre("Tonino");
		a1.setGrupo(g1);
		
		
		Instituto i1 = new Instituto();
		i1.addAlumno(a2);
		i1.muestraAlumnos();
		System.out.println("\n\nMuestra el numero de alumnos matriculados");
		System.out.println(i1.numAlumnos());
		
		System.out.println("Busca la posición del alumno");
		System.out.println(i1.buscaAlumnos(2));
		
	}
	
}