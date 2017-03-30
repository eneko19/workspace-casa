package inicio;

import auxiliar.Alumno;
import auxiliar.Grupo;
import instituto.Instituto;

public class Inicio {

	public static void main(String[] args) {
		
		Grupo g1 = new Grupo("FP",1,"A");
		Alumno a1 = new Alumno(1,"Gallego","Eneko",g1);
		Alumno a2 = new Alumno(2,"Fernandez","Tonino",g1);
		Alumno a3 = new Alumno(3,"Palomo","Paquito",g1);
		
		Instituto i1 = new Instituto();
		
		i1.addAlumno(a1);
		i1.addAlumno(a2);
		i1.addAlumno(a3);
		

		
		i1.muestraAlumnos();
		System.out.println();
		System.out.println("La posicion del alumno con número de expediente 3 es: " + i1.buscaAlumno(3));
		}
}
