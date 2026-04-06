package servicio;

import modelo.Aprendiz;
import modelo.Equipo;
import modelo.Prestamo;
import java.util.ArrayList;

public class InventarioPrestamos {
    private ArrayList<Aprendiz> aprendices = new ArrayList<>();
    private ArrayList<Equipo> equipos = new ArrayList<>();
    private ArrayList<Prestamo> prestamos = new ArrayList<>();

    public void registrarAprendiz(Aprendiz aprendiz) {
        aprendices.add(aprendiz);
        System.out.println("✓ Aprendiz registrado: " + aprendiz.getNombre());
    }

    public void registrarEquipo(Equipo equipo) {
        equipos.add(equipo);
        System.out.println("✓ Equipo registrado: " + equipo.getNombre());
    }

    public void listarEquipos() {
        System.out.println("\n=== EQUIPOS ===");
        for (Equipo e : equipos) {
            System.out.println(e.getCodigo() + " - " + e.getNombre() + " - " + (e.isDisponible() ? "Disponible" : "Prestado"));
        }
    }

    public Equipo buscarEquipo(String codigo) {
        for (Equipo e : equipos) {
            if (e.getCodigo().equals(codigo)) return e;
        }
        return null;
    }

    public Aprendiz buscarAprendiz(String documento) {
        for (Aprendiz a : aprendices) {
            if (a.getDocumento().equals(documento)) return a;
        }
        return null;
    }

    public void prestarEquipo(String codigo, String documento) {
        Equipo e = buscarEquipo(codigo);
        Aprendiz a = buscarAprendiz(documento);

        if (e == null) { System.out.println("❌ Equipo no existe"); return; }
        if (a == null) { System.out.println("❌ Aprendiz no existe"); return; }
        if (!e.isDisponible()) { System.out.println("❌ Equipo no disponible"); return; }

        try {
            Prestamo p = new Prestamo(a, e);
            prestamos.add(p);
            System.out.println("✓ Préstamo realizado");
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void devolverEquipo(String codigo) {
        for (Prestamo p : prestamos) {
            if (p.getEquipo().getCodigo().equals(codigo) && p.isActivo()) {
                try {
                    p.cerrar(java.time.LocalDate.now());
                    System.out.println("✓ Equipo devuelto");
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                return;
            }
        }
        System.out.println("❌ No hay préstamo activo para este equipo");
    }

    public void listarPrestamosActivos() {
        System.out.println("\n=== PRÉSTAMOS ACTIVOS ===");
        boolean hay = false;
        for (Prestamo p : prestamos) {
            if (p.isActivo()) {
                p.mostrarInfo();
                hay = true;
            }
        }
        if (!hay) System.out.println("No hay préstamos activos");
    }
}