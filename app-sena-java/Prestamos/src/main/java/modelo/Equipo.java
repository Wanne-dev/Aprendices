package modelo;

public class Equipo {
    private String codigo;
    private String nombre;
    private String categoria;
    private boolean disponible;

    public Equipo(String codigo, String nombre, String categoria) throws Exception {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new Exception("El código no puede estar vacío");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("El nombre no puede estar vacío");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.disponible = true;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public boolean isDisponible() { return disponible; }

    public void marcarPrestado() { this.disponible = false; }
    public void marcarDevuelto() { this.disponible = true; }

    public void mostrarInfo() {
        System.out.println(codigo + " - " + nombre + " (" + categoria + ") - " + (disponible ? "Disponible" : "Prestado"));
    }
}