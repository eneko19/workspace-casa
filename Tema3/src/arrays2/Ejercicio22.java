package arrays2;

import java.util.*;

public class Ejercicio22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		String matriculas[][] = new String [3][4];
		double total = 0;
		
		for (int i = 0; i < matriculas.length; i++) {
			System.out.println("Dime el nombre del alumno");
			matriculas[i][0] = entrada.nextLine();
			System.out.println("Dime la nota del examen");
			matriculas[i][1] = entrada.nextLine();
			System.out.println("Nota de trabajo");
			matriculas[i][2] = entrada.nextLine();
			System.out.println("Nota de actitud");
			matriculas[i][3] = entrada.nextLine();
		}
		
		System.out.println("Introducción de notas");
		System.out.println("===========================");
		for (int i = 0; i < matriculas.length; i++) {
			System.out.println("Nombre:" + matriculas[i][0] + "\nExámenes: " + matriculas[i][1] + "\nTrabajos: " + matriculas[i][2] + "\nActitud: " + matriculas[i][3]);
		}
		System.out.println("Nota de evaluacion");
		System.out.println("=====================");
		for (int i = 0; i < matriculas.length; i++) {
			total = Double.parseDouble(matriculas[i][1]) * 0.50 + Double.parseDouble(matriculas[i][2]) * 0.40 + Double.parseDouble(matriculas[i][3]) * 0.10;
			System.out.println(matriculas[i][0] + ": " + total);

		}
		
	}

}
