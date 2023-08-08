package main.java.com.poo.reservashotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private int numeroHabitacion;
    private TipoHabitacion tipoHabitacion;
    private boolean disponible;
    private List<Reserva> reservas;

    public Habitacion(int numeroHabitacion, TipoHabitacion tipoHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.disponible = true;
        this.reservas = new ArrayList<>();
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean estaDisponible(LocalDate fechaInicio, LocalDate fechaFin) {
        for (Reserva reserva : reservas) {
            if (reserva.coincideCon(fechaInicio, fechaFin)) {
                return false;
            }
        }
        return true;
    }

    public void agregarReserva(Reserva reserva) {
        disponible = false;
        reservas.add(reserva);
    }

    public void cancelarReserva(Reserva reserva) {
        disponible = true;
        reservas.remove(reserva);
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

}
