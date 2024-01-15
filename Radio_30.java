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
 * Interfaz grafica de la radio 
 *  
 */


public interface Radio_30 {
    
    void setEncendido(boolean estado);
    
    void setVolumen(int volumen);
    
    void setEstacion(float emisora, int banda);
    
    public static final int AM = 0;
    
    public static final int FM = 1;
    
    boolean getEncendido();
    
    float getEstacion();
    
    int getBanda();
    
    int getVolumen();
    
    void guardarEstacion(float emisora, int banda, int indice);
    
    float recuperarEstacion(int indice);
}
