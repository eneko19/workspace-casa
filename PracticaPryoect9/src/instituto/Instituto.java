package instituto;

import auxiliar.Alumno;
import auxiliar.Grupo;

public class Instituto {

	private final int MAX_ALUMNOS = 10;
	private Alumno alumnos[] = new Alumno[MAX_ALUMNOS];
	
	// Metodos
	public void addAlumno(Alumno alu){
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i] == null ){
				alumnos[i] = alu;
				break;
			}
		}
		
	}
	
	public void delAlumno(int numExp){
		int posicion = buscaAlumno(numExp);
		if(posicion != -1){
			alumnos[posicion] = null;
		}
	}
	
	public void muestraAlumnos(){
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i] != null){
				System.out.println(alumnos[i].toString());
			}
		}
	}
	
	public int numAlumnos(){
		int contador = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i] != null){
				contador++;
			}
		}
		return contador;
	}
	
	public int buscaAlumno(int numExp){
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i] != null && alumnos[i].getNumExpediente() == numExp){
				return i;
			}
		}
		return -1;
	}
	
	
	
	
	}
