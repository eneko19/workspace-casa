package instituto;

import auxiliar.Alumno;

public class Instituto {

	// Atributos
	
	private final int MAX_ALUMNOS = 10;
	private Alumno alumnos[] = new Alumno[MAX_ALUMNOS];
	
	// Métodos
	
	public void addAlumno(Alumno alu){
		
		for (int i = 0; i < alumnos.length; i++) {
			
			if(alumnos[i] == null){
				alumnos[i] = alu;
				break;
			}
		}
	}
	
	public void delAlumno(int numExp){
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i].getNumExpediente() == numExp){
				alumnos[i] = null;
				break;
			}
			
		}

	}
	public void muestraAlumnos(){
		
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i] != null){
				System.out.print(alumnos[i]);
			}else{
				continue;
			}
		}
	}
	
	public int numAlumnos(){
		int suma = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i] != null){
				suma = suma + 1;
			}
		}
		return suma;
	}
	
	public int buscaAlumnos(int numExp){
		 int posicion = 0;
	        
	        for (int i = 0; i < alumnos.length; i++) {
	            if (alumnos[i].getNumExpediente() == numExp) {
	                return i = posicion;
	            } else {
	                return -1;
	            }
	        }
	        
	        return posicion;
	}
	

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public int getMAX_ALUMNOS() {
		return MAX_ALUMNOS;
	}
	
	
}








