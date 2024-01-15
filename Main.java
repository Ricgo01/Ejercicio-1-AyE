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
			pr("Menu de Radio");
			pr("1. Encender Radio");
			pr("2. Volumen");
			pr("3. Seleccionar Estacion");
			pr("4. Guardar Estacion");
			pr("5. Poner Favorito");
			
			pr("Seleccione una opcion \n >");
			
			int opcion = scanner.nextInt();
			
			switch(opcion) {
				
				case 1: 
					break;
					
				case 2:
					break;
					
				case 3:
					System.out.println("Ingrese la banda que desea utilizar: \n 1. FM \n 2. AM");
					int banda = scanner.nextInt();
					System.out.println("Ingrese la estacion que desea utilizar: ");
					float estacion = scanner.nextFloat();
					radio.setEstacion(estacion, banda);
					break;
					
				case 4:
					System.out.println("Ingrese el numero de boton que desea utilizar: ");
					int boton = scanner.nextInt();
					radio.guardarEstacion(radio.getEstacion(),radio.getBanda(),boton);

					break;
				case 5:
					System.out.println("Ingrese el numero de boton que desea utilizar: ");
					int botonFav = scanner.nextInt();
					radio.recuperarEstacion(botonFav);
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
