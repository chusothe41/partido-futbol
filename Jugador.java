
import java.util.Random;

/**
 * Write a description of class Jugador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Jugador {

    // instance variables - replace the example below with your own

    private int numero;
    private String nombre;
    private int edad;
    private int forma;
    private boolean reserva;

    /**
     * Constructor for objects of class Jugador
     *
     * @param numero
     * @param nombre
     * @param edad
     * @param forma
     */
    public Jugador() {
        numero = 0;
        nombre = "";
        edad = generarAleatorio(18, 40);
        forma = generarAleatorio(0, 10);
        reserva = false;
    }

    protected int generarAleatorio(int desde, int hasta) {
        Random random = new Random();
        return random.nextInt(hasta - desde) + desde;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setReserva(boolean bool) {
        reserva = bool;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public boolean getReserva() {
        return reserva;
    }
    
    abstract public float getValoracion();
    
    public String toString() {
        String info = "";
        if(nombre.length() <= 5)
        {
            info = String.format("Dorsal %d.\t%s (%d anos)\t\tForma: %d\t", numero, nombre, edad, forma);            
        } else {
            info = String.format("Dorsal %d.\t%s (%d anos)\tForma: %d\t", numero, nombre, edad, forma);
        }
        return info;
    }
}
