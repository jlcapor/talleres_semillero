package main.java.com.poo.alumnos;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private int edad;
    private ArrayList<Nota> notas;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = new ArrayList<>();
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

    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

}
