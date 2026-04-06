package modelo;

public class Aprendiz {
    private String documento;
    private String nombre;
    private String ficha;
    private String telefono;
    
    public Aprendiz(String documento, String nombre, String ficha, String telefono) throws Exception {
        if (documento == null || documento.trim().isEmpty()) {
            throw new Exception("El documento no puede estar vacío");
        }
        if (telefono == null || telefono.replaceAll("[^0-9]", "").length() < 10) {
            throw new Exception("El teléfono debe tener al menos 10 dígitos");
        }
        this.documento = documento;
        this.nombre = nombre;
        this.ficha = ficha;
        this.telefono = telefono;
    }
    
    public String getDocumento() { return documento; }
    public String getNombre() { return nombre; }
    public String getFicha() { return ficha; }
    public String getTelefono() { return telefono; }
    
    public void mostrarInformacion() {
        System.out.println("Documento: " + documento + " | Nombre: " + nombre + " | Ficha: " + ficha);
    }
}