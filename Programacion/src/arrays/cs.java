package arrays;

import java.util.Scanner;

public class cs {
	// Crea un programa que te pida el nombre del jugador, las bajas, las muertes, las asistencias.También deverá tener el porcentaje de bajas del jugador.
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String stats[][] = new String [2][4];
		Double porcentaje;
		
		for (int i = 0; i < stats.length; i++) {
			System.out.println("¿Cuál es el nombre de tu usuario?");
			stats[i][0] = entrada.nextLine();
			System.out.println("¿Cuántas bajas has hecho?");
			stats[i][1] = entrada.nextLine();
			System.out.println("¿Cuántas veces te han matado?");
			stats[i][2] = entrada.nextLine();
			System.out.println("¿Cuántas asistencias has hecho?");
			stats[i][3] = entrada.nextLine();		
		}
		
		System.out.println("Estadísticas \n=====================");
		
		 for (int i = 0; i < stats.length; i++) {
			 porcentaje = Double.parseDouble(stats[i][1]) / Double.parseDouble(stats[i][2]);
			System.out.println("Nombre: " + stats[i][0] + "\nBajas: " + stats[i][1] + "\nMuertes: " + stats[i][2] + "\nAsistencias: " + stats[i][3] + "\nPorcentaje: " + porcentaje + 
					"\n====================");
		}
		 
	}

}
