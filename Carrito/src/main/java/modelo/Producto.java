package modelo;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public void reducirStock(int cantidad) {
        this.stock -= cantidad;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " - $" + precio + " (Stock: " + stock + ")");
    }
}