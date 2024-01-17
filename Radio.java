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
 * Clase radio para identificar funcionamiento y partes de una radio 
 *  
 */

import java.lang.reflect.Array;

/**
 * Clase que representa una radio con funcionalidades básicas como encender/apagar,
 * ajustar volumen y estación, y almacenar estaciones favoritas.
 */

public class Radio implements Radio_30 {

	private boolean encendido;
	protected String marca;
	private int banda = 1;
	private float estacion = 87.9f;; 
	private int volumen;
	float[] favoritos = new float[12];
	int[] favoritosB = new int[12];
	
	
	
	/**
     * Establece el estado de encendido de la radio.
     * 
     * @param estado El estado de encendido de la radio (true para encendido, false para apagado).
     */
	
	@Override
	public void setEncendido(boolean estado) {
		// TODO Auto-generated method stub
		this.encendido = estado;
	}

	 /**
     * Establece el volumen de la radio.
     * 
     * @param volumen El nivel de volumen a establecer (0-100).
     */

	@Override
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	/**
     * Método para aumentar el volumen de la radio en incrementos de 5,
     * no excediendo el máximo de 100.
     */

	public void subirVolumen() {
		if (volumen < 100){
			volumen = volumen + 5;
			pr("El volumen actual es " + volumen + " %");
		} else{
			pr("El volumen ya llego a el maximo");
		}
	}

	/**
     * Método para disminuir el volumen de la radio en decrementos de 5,
     * no cayendo por debajo de 0.
     */

	public void bajarVolumen() {
		if (volumen > 0){
			volumen = volumen - 5;
			pr("El volumen actual es " + volumen +  "%");
			}else {
				pr("El volumen ya llego al minimo");
			}
	}

	/**
     * Establece la estación actual de la radio, ajustándola a los límites
     * permitidos dependiendo de la banda (AM o FM).
     *
     * @param emisora La
	frecuencia de la estación a sintonizar.
	* @param banda La banda en la que se encuentra la estación (1 para FM, 2 para AM).
	*/

	@Override
	public void setEstacion(float emisora, int banda) {
		String emisoraS = String.valueOf(emisora);
		int punto = emisoraS.indexOf(".");
		//FM
		if (banda == 1) {
			int decimal = Integer.parseInt(emisoraS.substring(punto+1));
			if (decimal % 2 == 0) {
				emisora = emisora + 0.1f;
			}
			if (emisora < 87.9) {
				emisora = 87.9f;
			} else if (emisora > 107.9) {
				emisora = 107.9f;
			} 
			this.estacion = emisora;
			this.banda = banda;
			
			//Print 
			String nom;
			if(banda == 1) {
				nom = "FM";
			}
			else {
				nom = "AM";
			}
			
			pr("La banda seleccionada fue: " + nom );
			pr("La emisora sonando es: " + emisora);
			
			
		}
		//AM
		else if (banda == 2) {
			int emisoraI = Integer.parseInt(emisoraS.substring(0, punto - 1));
			emisora = emisoraI * 10;
			if (emisoraI < 530) {
				emisoraI = 530;
			} else if (emisoraI > 1610) {
				emisoraI = 1610;
			} 
			emisora = emisoraI;
			this.estacion = emisora;
			this.banda = banda;
			
			String nom;
			if(banda == 1) {
				nom = "FM";
			}
			else {
				nom = "AM";
			}
			pr("La banda seleccionada fue: " + nom );
			pr("La emisora sonando es: " + emisora);
		}
		
		
	}

	/**
	 * Obtiene el estado actual de encendido de la radio.
	 *
	 * @return Estado actual de encendido de la radio (true si está encendida, false si está apagada).
	 */

	@Override
	public boolean getEncendido() {
		// TODO Auto-generated method stub
		return encendido;
	}

	/**
	 * Obtiene la estación actual de la radio.
	 *
	 * @return La frecuencia de la estación actual.
	 */

	@Override
	public float getEstacion() {
		return estacion;
	}

	/**
	 * Obtiene la banda actual de la radio.
	 *
	 * @return La banda actual (1 para FM, 2 para AM).
	 */

	@Override
	public int getBanda() {
		// TODO Auto-generated method stub
		return banda;
	}

	/**
	 * Obtiene el nivel actual de volumen de la radio.
	 *
	 * @return El nivel de volumen actual.
	 */

	@Override
	public int getVolumen() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Guarda una estación en el arreglo de estaciones favoritas.
	 *
	 * @param emisora La frecuencia de la estación a guardar.
	 * @param banda La banda de la estación a guardar.
	 * @param indice El índice en el arreglo de favoritos donde se almacenará la estación.
	 */

	@Override
	public void guardarEstacion(float emisora, int banda, int indice) {
		indice = indice - 1;
		favoritos[indice] = emisora;
		favoritosB[indice] = banda;
		
		pr("El indice " + indice);
		pr("La emisora " + emisora);
		String nom;
		if(banda == 1) {
			nom = "FM";
		}
		else {
			nom = "AM";
		}
		pr("en la banda " + nom);
	}

	/**
	 * Recupera una estación del arreglo de estaciones favoritas.
	 *
	 * @param indice El índice en el arreglo de favoritos del cual recuperar la estación.
	 * @return La frecuencia de la estación favorita recuperada.
	 */

	@Override
	public float recuperarEstacion(int indice) {
		indice = indice - 1;
		estacion = favoritos[indice];
		banda = favoritosB[indice];
		pr("" + indice);
		pr("La estacion " + estacion + " esta sonando");
		return estacion;
		
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