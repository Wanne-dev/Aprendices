package com.sena;

public class Aprendiz {

  // 1) ATRIBUTOS (encapsulados -> private)
  private String documento;
  private String nombre;
  private String correo;
  private int edad;

  // 2) CONSTRUCTOR VACÍO (opcional pero útil)
  public Aprendiz() {}

  // 3) CONSTRUCTOR COMPLETO (para crear objetos con datos)
  public Aprendiz(String documento, String nombre, String correo, int edad) {
    this.documento = documento;
    this.nombre = nombre;
    setCorreo(correo); // usamos setter para validar
    setEdad(edad);     // usamos setter para validar
  }

  // 4) GETTERS (leer datos)
  public String getDocumento() { return documento; }
  public String getNombre() { return nombre; }
  public String getCorreo() { return correo; }
  public int getEdad() { return edad; }

  // 5) SETTERS (modificar datos) + validaciones
  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setCorreo(String correo) {
    if (correo == null || !correo.contains("@")) {
      throw new IllegalArgumentException("Correo inválido. Debe contener '@'.");
    }
    this.correo = correo;
  }

  public void setEdad(int edad) {
    if (edad < 0) {
      throw new IllegalArgumentException("La edad no puede ser negativa.");
    }
    this.edad = edad;
  }

  // 6) MÉTODO DE COMPORTAMIENTO (lo que el objeto "hace")
  public String presentarse() {
    return "Aprendiz{" +
        "documento='" + documento + '\'' +
        ", nombre='" + nombre + '\'' +
        ", correo='" + correo + '\'' +
        ", edad=" + edad +
        '}';
  }
}