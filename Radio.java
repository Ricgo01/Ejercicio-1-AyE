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
		
	}

	@Override
	public void setVolumen(int volumen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEstacion(float emisora, int banda) {
		String emisoraS = String.valueOf(emisora);
		int punto = emisoraS.indexOf(".");
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
			
		}
		else if (banda == 0) {
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
		}
		
		
	}

	@Override
	public boolean getEncendido() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float getEstacion() {
		return estacion;
	}

	@Override
	public int getBanda() {
		// TODO Auto-generated method stub
		return 0;
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
		
	}

	@Override
	public float recuperarEstacion(int indice) {
		estacion = favoritos[indice];
		banda = favoritosB[indice];
		return estacion;
	}

	


    
}