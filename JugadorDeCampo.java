
/**
 * Write a description of class JugadorDeCampo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JugadorDeCampo extends Jugador {

    private int pase;
    private int regate;
    private int remate;

    /**
     * Constructor for objects of class JugadorDeCampo
     *
     * @param numero
     * @param nombre
     * @param edad
     * @param forma
     * @param reserva
     */
    public JugadorDeCampo() {
        super();
        this.pase = generarAleatorio(0, 10);
        this.regate = generarAleatorio(0, 10);
        this.remate = generarAleatorio(0, 10);
    }
    
    public String toString() {
        return (super.toString() + String.format("Pases: %d\tRegate: %d\tRemate: %d\tValoracion: %d\t", pase, remate, regate, (int)getValoracion()));
    }
    
    public float getValoracion() {
        return (pase + regate + remate) / 3;
    }
}
