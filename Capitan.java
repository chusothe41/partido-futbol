
/**
 * Write a description of class Capitan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Capitan extends JugadorDeCampo {

    // instance variables - replace the example below with your own

    private int liderazgo;

    /**
     * Constructor for objects of class Capitan
     *
     * @param numero
     * @param nombre
     * @param edad
     * @param forma
     */
    public Capitan() {
        super();
        liderazgo = generarAleatorio(0, 5);
    }
    
    public float getValoracion() {
        return super.getValoracion() + (liderazgo / 4);
    }
    
    public String toString() {
        return (super.toString() + String.format("Liderazgo: %d (Cap)", liderazgo));
    }
}
