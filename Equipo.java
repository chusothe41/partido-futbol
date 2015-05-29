
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

/**
 * Write a description of class Equipo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Equipo {

    private String nombre;
    private int numeroJugadores;
    private ArrayList<Jugador> jugadores;

    /**
     * Constructor for objects of class Equipo
     *
     * @param nombre
     * @param numeroJugadores
     */
    public Equipo(String nombre, int numeroJugadores) {
        jugadores = new ArrayList<>();
        this.nombre = nombre;
        this.numeroJugadores = numeroJugadores;
        crearJugadores();
    }

    private void crearJugadores() {
        Random random = new Random();
        for (int i = 0; i < numeroJugadores - 1; i++) {
            if (i == 0) {
                Jugador capitan = new Capitan();
                jugadores.add(capitan);

                Jugador portero = new Portero();
                jugadores.add(portero);
            } else {
                Jugador jugadorDeCampo = new JugadorDeCampo();
                jugadores.add(jugadorDeCampo);
            }
        }
        nombrarJugadores();
        numerarJugadores();
        asignarReservas();
    }

    private void nombrarJugadores() {
        Random random = new Random();
        String[] nombres = {"Ramon", "Pedro", "Juan", "Mario", "Marcos", "Miguel", "Luis",
                "Carlos", "Jose Ramon", "Federico", "Alberto", "Roberto", "Ruben", "Guillermo",
                "Hector", "Mario", "Felipe", "Manuel", "Tomas", "Agustin", "Jose Manuel",
                "Juan Jesus", "Pepe", "Ricardo", "Fernando", "Antonio", "Jose Alberto", "Jose Luis",
                "David", "Emilio", "Cesar", "German", "Raul", "Pablo"};
        for (Jugador i : jugadores) {
            i.setNombre(nombres[random.nextInt(nombres.length)]);
        }
    }

    private void numerarJugadores(){
        Collections.shuffle(jugadores);
        int contador = 2;
        for (Jugador i : jugadores) {
            if(i instanceof Portero) {
                i.setNumero(1);
                contador--;
            } else {
                i.setNumero(contador);
            }
            contador++;
        }
    }

    private void asignarReservas() {
        Collections.shuffle(jugadores);
        int contador = 0;
        for (Jugador i : jugadores) {
            if(i instanceof JugadorDeCampo && i instanceof Capitan == false && contador < reservas()) {
                i.setReserva(true);
                contador++;
            }
        }
    }

    /**
     * Metodo que calcula la valoracion media de los jugadores.
     * 
     * @params titulares, en este campo se define si se quiere la valoracion media de los titulares,
     * si es true y de los reservas si es false
     */
    public float ValoracionMedia(boolean titulares) {

        int contador = 0;
        float sumatorio = 0;

        for (Jugador i : jugadores) {
            if(i.getReserva() != titulares) {
                sumatorio += i.getValoracion();
                contador++;
            }
        }
        return sumatorio / contador;
    }

    public int reservas() {
        return numeroJugadores - 11;
    }

    public void imprimirJugadores() {
        Collections.shuffle(jugadores);
        System.out.println(nombre);
        System.out.println("Titulares:");
        for (Jugador i: jugadores) {
            if(!i.getReserva()) {
                System.out.println(i.toString());
            }
        }
        System.out.println(String.format("*************************** Media de valoracion del equipo titular: %.2f ***************************", ValoracionMedia(true)));
        System.out.println("Reservas:");
        for (Jugador i: jugadores) {
            if(i.getReserva()) {
                System.out.println(i.toString());
            }
        }
    }

    public String toString() {
        return nombre;
    }
}
