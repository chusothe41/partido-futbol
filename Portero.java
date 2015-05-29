
/**
 * Write a description of class Portero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Portero extends Jugador {

    private int agilidad;
    private int fortalezaMental;

    /**
     * Constructor for objects of class Portero
     *
     * @param nombre
     * @param edad
     * @param forma
     * @param fortalezaMental
     * @param agilidad
     */
    public Portero() {
        super();
        this.agilidad = generarAleatorio(0, 10);
        this.fortalezaMental = generarAleatorio(0, 10);
    }
    
    public float getValoracion() {
        return (agilidad + fortalezaMental) / 2;
    }
    
    public String toString() {
        return (super.toString() + String.format("Agil.: %d\tFortM.: %d\t\t\tValoracion: %d\t", agilidad, fortalezaMental, (int)getValoracion()));
    }
}
