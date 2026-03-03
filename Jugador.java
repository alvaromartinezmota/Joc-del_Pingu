package modelo;

public abstract class Jugador {

    protected int posicion;
    protected String nombre;
    protected String color;

    public Jugador(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        this.posicion = 0;
    }

    public abstract void mover(int nuevaPosicion);

    public int getPosicion() {
        return posicion;
    }

    public String getNombre() {
        return nombre;
    }
}