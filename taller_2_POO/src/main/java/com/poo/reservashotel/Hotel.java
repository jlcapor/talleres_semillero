package main.java.com.poo.reservashotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private String direccion;
    private String telefono;
    private int cantidadHabitaciones;
    private List<Habitacion> habitaciones;
    private List<Cliente> clientesRegistrados;

    public Hotel(String nombre, String direccion, String telefono, int cantidadHabitaciones) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.habitaciones = new ArrayList<>();
        for (int i = 1; i <= cantidadHabitaciones; i++) {
            habitaciones.add(new Habitacion(i));
        }
        this.clientesRegistrados = new ArrayList<>();
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

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public void agregarHabitacion(int numero) {
        habitaciones.add(new Habitacion(numero));
    }

    public List<Habitacion> getHabitacionesDisponibles() {
        List<Habitacion> disponibles = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.isDisponible()) {
                disponibles.add(habitacion);
            }
        }
        return disponibles;
    }

    public void registrarCliente(Cliente cliente) {
        clientesRegistrados.add(cliente);
    }

    public Cliente obtenerDatosClienteRegistrado(Cliente cliente) {
        return clientesRegistrados.stream()
                .filter(c -> c.equals(cliente))
                .findFirst()
                .orElse(null);
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

}
