package main.java.com.poo.reservashotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    public static int id = 0;
    private int numeroHabitacion;
    private List<Reserva> reservas;

    public Habitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.reservas = new ArrayList<>();
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    

}
