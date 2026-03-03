package modelo;

public class Pinguino extends Jugador {

    private Inventario inventario;

    public Pinguino(String nombre, String color) {
        super(nombre, color);
        this.inventario = new Inventario();
    }

    @Override
    public void mover(int nuevaPosicion) {
        this.posicion = nuevaPosicion;
    }

    public Inventario getInventario() {
        return inventario;
    }
}
