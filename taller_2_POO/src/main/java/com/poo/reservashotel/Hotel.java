package main.java.com.poo.reservashotel;

import java.util.HashMap;
import java.util.Map;

public class Hotel {
    private String nombre;
    private String direccion;
    private String telefono;
    private Map<Integer, Habitacion> habitaciones;

    public Hotel(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.habitaciones = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Map<Integer, Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Map<Integer, Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

}
