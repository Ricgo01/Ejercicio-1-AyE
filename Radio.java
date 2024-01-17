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

public class Radio implements Radio_30 {

	private boolean encendido;
	protected String marca;
	private int banda;
	private float estacion; 
	private int volumen;
	float[] favoritos = new float[12];
	int[] favoritosB = new int[12];
	
	
	
	
	
	@Override
	public void setEncendido(boolean estado) {
		// TODO Auto-generated method stub
		this.encendido = estado;
	}

	@Override
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public void subirVolumen() {
		if (volumen < 100){
			volumen = volumen + 5;
			pr("El volumen actual es " + volumen + " %");
		} else{
			pr("El volumen ya llego a el maximo");
		}
	}

	public void bajarVolumen() {
		if (volumen > 0){
			volumen = volumen - 5;
			pr("El volumen actual es " + volumen +  "%");
			}else {
				pr("El volumen ya llego al minimo");
			}
	}

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

	@Override
	public boolean getEncendido() {
		// TODO Auto-generated method stub
		return encendido;
	}

	@Override
	public float getEstacion() {
		return estacion;
	}

	@Override
	public int getBanda() {
		// TODO Auto-generated method stub
		return banda;
	}

	@Override
	public int getVolumen() {
		// TODO Auto-generated method stub
		return 0;
	}

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