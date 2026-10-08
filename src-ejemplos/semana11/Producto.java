package semana11;

public class Producto implements Exportable {
    private String nombre;
    private int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String exportar() {
        return "PRODUCTO;" + nombre + ";" + precio;
    }
}