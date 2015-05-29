
/**
 * Write a description of class Partido here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Partido {

    // instance variables - replace the example below with your own

    private Equipo local;
    private Equipo visitante;

    /**
     * Constructor for objects of class Partido
     *
     * @param local
     * @param visitante
     */
    public Partido(Equipo local, Equipo visitante) {
        this.local = local;
        this.visitante = visitante;
    }
    
    public void mostrarAlineaciones() {
        local.imprimirJugadores();
        System.out.print("\n");
        visitante.imprimirJugadores();
    }
}

