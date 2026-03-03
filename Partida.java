package modelo;

import java.util.ArrayList;

public class Partida {

    private Tablero tablero;
    private ArrayList<Jugador> jugadores;
    private int turno;

    public Partida() {
        this.tablero = new Tablero();
        this.jugadores = new ArrayList<>();
        this.turno = 0;
    }

    public void añadirJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public Jugador getJugadorActual() {
        return jugadores.get(turno);
    }

    public void siguienteTurno() {
        turno = (turno + 1) % jugadores.size();
    }

    public Tablero getTablero() {
        return tablero;
    }
}