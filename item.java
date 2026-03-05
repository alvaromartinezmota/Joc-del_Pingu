package modelo;

public abstract class Item {

    protected String nombre;

    public Item(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
