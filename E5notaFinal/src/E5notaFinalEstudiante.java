/*
 * La calificacion final de un estudiante de Informática se calcula con base a las calificaciones
 * de cuatro aspectos de su rendimiento académico: participación, primer examen parcial, 
 * segundo examen parcia, examen final.
 * Sabiendo que las calificaciones anteriores entrar a la calificación final con
 * con ponderaciones de 10%, 25%, 25% y 40%. 
 * 
 * Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante. 
 * 
 * */
import java.util.Scanner;

public class E5notaFinalEstudiante {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;
		
		//Pedir los datos necesarios
		System.out.println("Escriba la nota de participación: ");
		participacion = entrada.nextFloat();
				
		System.out.println("Escriba la nota del primer examen: ");
		primerExamen = entrada.nextFloat();

		System.out.println("Escriba la nota del segundo examen: ");
		segundoExamen = entrada.nextFloat();

		System.out.println("Escriba la nota del examen final: ");
		examenFinal = entrada.nextFloat();

		//Sacamos los calculos

		participacion *=0.10f;
		primerExamen *=0.25f;
		segundoExamen *=0.25f;
		examenFinal *=0.40f;
		
		//Sumamos las notas
		notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
		
		//Mostramos la nota final
		System.out.println("La nota final es " + notaFinal);
		
	}

}
