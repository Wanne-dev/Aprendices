package com.sena;

import java.util.ArrayList;

public class App {

  public static void main(String[] args) {

    // 1) creamos objetos (INSTSANCIAS)

    Aprendiz aprendiz1 = new Aprendiz("123456789", "Juan Pérez", "juan@gmail.com", 25);
    Aprendiz aprendiz2 = new Aprendiz("987654321", "María Gómez", "maria@gmail.com", 22);
    Aprendiz aprendiz3 = new Aprendiz("456789123", "Carlos López", "carlos@gmail.com", 28);
    Aprendiz aprendiz4 = new Aprendiz("111222333", "Ana Torres", "ana@gmail.com", 23);
    Aprendiz aprendiz5 = new Aprendiz("222333444", "Luis Martínez", "luis@gmail.com", 26);
    Aprendiz aprendiz6 = new Aprendiz("333444555", "Sofía Ramírez", "sofia@gmail.com", 21);
    Aprendiz aprendiz7 = new Aprendiz("444555666", "Diego Herrera", "diego@gmail.com", 24);
    Aprendiz aprendiz8 = new Aprendiz("555666777", "Valentina Castro", "valentina@gmail.com", 22);
    Aprendiz aprendiz9 = new Aprendiz("666777888", "Andrés Morales", "andres@gmail.com", 27);
    Aprendiz aprendiz10 = new Aprendiz("777888999", "Laura Sánchez", "laura@gmail.com", 23);

    // 2) guardamos los objetos en una lista

    ArrayList<Aprendiz> ficha = new ArrayList<>();
    ficha.add(aprendiz1);
    ficha.add(aprendiz2);
    ficha.add(aprendiz3);
    ficha.add(aprendiz4);
    ficha.add(aprendiz5);
    ficha.add(aprendiz6);
    ficha.add(aprendiz7);
    ficha.add(aprendiz8);
    ficha.add(aprendiz9);
    ficha.add(aprendiz10);

    // 3) mostramos la información de cada aprendiz usando el método presentarse()

    for (Aprendiz aprendiz : ficha) {
      System.out.println(aprendiz.presentarse());
    }

    // 4) ejemplo de encapsulamiento: actualizar con setter
    aprendiz1.setCorreo("juan.perez@outlook.com");

    // 5) mostramos la información actualizada del aprendiz1
    System.out.println("Información actualizada de aprendiz1: " + aprendiz1.presentarse());

    // prueba de validación: intentar asignar un correo inválido
    try {
      aprendiz2.setCorreo("mariagmail.com"); // correo sin '@'
    } catch (IllegalArgumentException e) {
      System.out.println("Error al actualizar correo de aprendiz2: " + e.getMessage());
    }

  }

}
