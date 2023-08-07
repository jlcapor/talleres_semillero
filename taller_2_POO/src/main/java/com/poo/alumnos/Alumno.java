package main.java.com.poo.alumnos;

import java.util.ArrayList;

public class Alumno {
    private int id;
    private String nombre;
    private int edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void agregarNota(Calificacion nota) {
        notas.add(nota);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double calcularPromedio() {
        if (notas.isEmpty()) {
            return 0;
        } else {
            double sum = 0;
            for (Calificacion nota : notas) {
                sum += nota.getValor();
            }
            return sum / notas.size();
        }
    }
}
