package main.java.com.poo.reservashotel;

import java.util.List;

public class SistemaReservasHotel {

    /**
     * this.nombre = nombre;
     * this.direccion = direccion;
     * this.telefono = telefono;
     */
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Hotel A", "calle 234", "123456789", 10);
        Hotel hotel2 = new Hotel("Hotel B", "calle 634", "45432345", 50);
        
        List<Habitacion> disponiblesHotel1 = hotel1.getHabitacionesDisponibles();
        List<Habitacion> disponiblesHotel2 = hotel2.getHabitacionesDisponibles();
        
        for (int i = 0; i < disponiblesHotel1.size(); i++) {
            System.out.println("Reserva 1:" + disponiblesHotel1.get(i).getNumeroHabitacion());
        }


    }
}
