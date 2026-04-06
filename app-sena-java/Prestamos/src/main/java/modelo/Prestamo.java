package modelo;

import java.time.LocalDate;

public class Prestamo {
    private Aprendiz aprendiz;
    private Equipo equipo;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private boolean activo;
    
    public Prestamo(Aprendiz aprendiz, Equipo equipo) throws Exception {
        if (!equipo.isDisponible()) {
            throw new Exception("El equipo no está disponible");
        }
        this.aprendiz = aprendiz;
        this.equipo = equipo;
        this.fechaPrestamo = LocalDate.now();
        this.activo = true;
        equipo.marcarPrestado();
    }
    
    public Aprendiz getAprendiz() { return aprendiz; }
    public Equipo getEquipo() { return equipo; }
    public boolean isActivo() { return activo; }
    
    public void cerrar(LocalDate fechaDevolucion) throws Exception {
        if (!activo) {
            throw new Exception("Este préstamo ya está cerrado");
        }
        this.activo = false;
        this.fechaDevolucion = fechaDevolucion;
        equipo.marcarDevuelto();
    }
    
    public void mostrarInfo() {
        System.out.println("Aprendiz: " + aprendiz.getNombre() + " | Equipo: " + equipo.getNombre());
        System.out.println("Fecha: " + fechaPrestamo + " | Estado: " + (activo ? "ACTIVO" : "DEVUELTO"));
    }
}