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

    /**
     * Establece el estado de encendido de la radio.
     * 
     * @param estado El estado de encendido de la radio (true para encender, false para apagar).
     */
    
    void setEncendido(boolean estado);

    /**
     * Ajusta el volumen de la radio.
     * 
     * @param volumen El nivel de volumen a establecer (valor entero).
     */
    
    void setVolumen(int volumen);

    /**
     * Establece la estación de la radio.
     * 
     * @param emisora La frecuencia de la estación a sintonizar.
     * @param banda La banda en la que se encuentra la estación (AM o FM).
     */
    
    void setEstacion(float emisora, int banda);
    

    // Constantes para representar las bandas AM y FM.
    public static final int AM = 0;
    
    public static final int FM = 1;

    /**
     * Obtiene el estado de encendido de la radio.
     * 
     * @return
    El estado actual de encendido de la radio (true si está encendida, false si está apagada).
    */
    
    boolean getEncendido();

    /**
     * Obtiene la estación actual de la radio.
     * 
     * @return La frecuencia de la estación actualmente sintonizada.
     */
    
    float getEstacion();

    /**
     * Obtiene la banda actual de la radio.
     * 
     * @return La banda actual de la radio (AM o FM).
     */
    
    int getBanda();

    /**
     * Obtiene el volumen actual de la radio.
     * 
     * @return El nivel actual del volumen de la radio.
     */
    
    int getVolumen();

    /**
     * Guarda la estación actual en el índice especificado.
     * 
     * @param emisora La frecuencia de la estación a guardar.
     * @param banda La banda de la estación a guardar (AM o FM).
     * @param indice El índice donde se guardará la estación (generalmente un número entre 1 y 10).
     */
    
    void guardarEstacion(float emisora, int banda, int indice);

    /**
     * Recupera una estación guardada en un índice específico.
     * 
     * @param indice El índice de la estación guardada que se desea recuperar.
     * @return La frecuencia de la estación recuperada.
     */
    
    float recuperarEstacion(int indice);
}
