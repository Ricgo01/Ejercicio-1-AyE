/*
 * Algoritmos y Estructura de Datos
 * 3 Semestre
 * Facultad de Ingenieria
 * Departamento de Ciencias de la Computacion
 * Fecha inicio: 13/01/2024
 * Fecha final: /01/2024
 *
 * @author Vianka Castro 23201
 * 		   Ricardo Godinez 23247
 * 		   Brandon Rivera 23088
 * 		   Felipe Aguilar 23195
 * 
 * Interaccion con el usuario para controlar la radio 
 *  
 */

import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		Radio radio = new Radio();
		
		boolean salir = false;
		
		while(!salir) {
			pr("======= RADIO ======");
			pr("1.");
			pr("2.");
			pr("3.");
			
			pr("Seleccione una opcion \n >");
			
			int opcion = scanner.nextInt();
			
			switch(opcion) {
				
				case 1: 
					break;
					
				case 2:
					break;
					
				case 3:
					break;
					
				case 4:
					break;
			
		
			}
			
		}
		
	}
	
	 /**
	  * Método privado utilizado para imprimir un mensaje en la consola.
	  *
	  * Este método imprime el mensaje proporcionado como parámetro en la consola estándar.
	  * Se utiliza para simplificar la impresión de mensajes en varias partes del código.
	  *
	  * @param x El mensaje que se desea imprimir en la consola.
	  */
	 private static void pr(String x) {
			System.out.println(x);
		}
}
