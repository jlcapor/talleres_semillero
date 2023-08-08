package main.java.com.poo.alumnos;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Alumno extends Persona {

    private List<Calificacion> calificaciones;

    public Alumno(int codigo, String nombre, String apellidos, int edad, String direccion, String correoElectronico,
            String numeroTelefono) {
        super(codigo, nombre, apellidos, edad, direccion, correoElectronico, numeroTelefono);
        this.calificaciones = new ArrayList<>();
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void agregarCalificacion(double valor) {
        Calificacion calificacion = new Calificacion(valor);
        calificaciones.add(calificacion);
    }

    public double calcularPromedio() {
        if (calificaciones.isEmpty()) {
            return 0;
        }

        double total = 0;
        for (Calificacion calificacion : calificaciones) {
            total += calificacion.getValor();
        }
        return total / calificaciones.size();
    }

    public void mostrarInformacion() {
        String info = "Nombre: " + getNombre() +
                "\nEdad: " + getEdad() +
                "\nCalificaciones: " + getCalificaciones() +
                "\nPromedio de calificaciones: " + calcularPromedio();
        JOptionPane.showMessageDialog(null, info);
    }

}
