package modelo;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> items;

    public Carrito() {
        items = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        items.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : items) {
            total += p.getPrecio();
        }
        return total;
    }

    public void listar() {
        if (items.isEmpty()) {
            System.out.println("El carrito está vacío.");
            return;
        }
        System.out.println("\n=== CARRITO ===");
        for (Producto p : items) {
            System.out.println("- " + p.getNombre() + " : $" + p.getPrecio());
        }
        System.out.println("TOTAL: $" + calcularTotal());
    }

    public void vaciar() {
        items.clear();
    }

    public boolean estaVacio() {
        return items.isEmpty();
    }
}