package main.java.com.poo.alumnos;

import java.util.ArrayList;

public class Curso {
    private String nombre;
    private ArrayList<Alumno> alumnos;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

}
