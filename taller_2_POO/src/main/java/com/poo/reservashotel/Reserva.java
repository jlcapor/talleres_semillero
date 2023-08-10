package main.java.com.poo.reservashotel;

import java.time.LocalDate;
import java.util.List;

public class Reserva {

    private Cliente cliente;
    private Hotel hotel;
    private List<Habitacion> habitaciones;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Reserva(Cliente cliente, Hotel hotel, List<Habitacion> habitaciones, LocalDate fechaInicio,
            LocalDate fechaFin) {
        this.cliente = cliente;
        this.hotel = hotel;
        this.habitaciones = habitaciones;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean coincideCon(LocalDate fechaInicio, LocalDate fechaFin) {
        return !(fechaFin.isBefore(this.fechaInicio) || fechaInicio.isAfter(this.fechaFin));
    }
}
