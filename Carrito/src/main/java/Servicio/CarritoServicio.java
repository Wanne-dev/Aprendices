package servicio;

import modelo.Producto;
import modelo.Carrito;
import java.util.ArrayList;

public class CarritoServicio {
    private ArrayList<Producto> inventario;

    public CarritoServicio() {
        inventario = new ArrayList<>();
    }

    public void agregarProductoInventario(Producto p) {
        inventario.add(p);
        System.out.println("✓ Producto agregado: " + p.getNombre());
    }

    public void listarProductos() {
        System.out.println("\n=== PRODUCTOS DISPONIBLES ===");
        for (Producto p : inventario) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProducto(String nombre) {
        for (Producto p : inventario) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    public boolean agregarAlCarrito(Carrito carrito, String nombre, int cantidad) {
        Producto p = buscarProducto(nombre);
        if (p == null) {
            System.out.println("❌ Producto no encontrado.");
            return false;
        }
        if (p.getStock() < cantidad) {
            System.out.println("❌ Stock insuficiente. Solo hay " + p.getStock());
            return false;
        }
        for (int i = 0; i < cantidad; i++) {
            carrito.agregarProducto(p);
        }
        p.reducirStock(cantidad);
        System.out.println("✓ " + cantidad + " x " + p.getNombre() + " agregado(s).");
        return true;
    }

    public void finalizarCompra(Carrito carrito) {
        if (carrito.estaVacio()) {
            System.out.println("No hay productos en el carrito.");
            return;
        }
        System.out.println("\n✅ COMPRA REALIZADA. Total pagado: $" + carrito.calcularTotal());
        carrito.vaciar();
    }
}