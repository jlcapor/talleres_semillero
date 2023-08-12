package main.java.com.poo.reservashotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class SistemaReservasHotel {
    private List<Hotel> hoteles;
    private List<Reserva> reservas;

    public SistemaReservasHotel() {
        this.hoteles = new ArrayList<>();
        hoteles.add(new Hotel("Hotel A", "Calle 23 c N 34", "122312312", 10));
        hoteles.add(new Hotel("Hotel B", "Calle 23 A N 60", "343567890", 15));

        this.reservas = new ArrayList<>();
    }

    public Habitacion seleccionarHabitacionDisponible(Hotel hotel, LocalDate fechaInicio, LocalDate fechaFin) {
        List<Habitacion> habitacionesDisponibles = new ArrayList<>();
        for (Habitacion habitacion : hotel.getHabitaciones()) {
            if (habitacion.estaDisponible(fechaInicio, fechaFin)) {
                habitacionesDisponibles.add(habitacion);
            }
        }

        if (habitacionesDisponibles.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "No hay habitaciones disponibles en " + hotel.getNombre() + " para las fechas seleccionadas.");
            return null;
        }
        JComboBox<String> habitacionComboBox = new JComboBox<>();
        for (Habitacion habitacion : habitacionesDisponibles) {
            habitacionComboBox.addItem(habitacion.toString());
        }

        int seleccione = JOptionPane.showConfirmDialog(
                null,
                habitacionComboBox,
                "Seleccione una habitación disponible:",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (seleccione == JOptionPane.OK_OPTION) {
            int selectedIndex = habitacionComboBox.getSelectedIndex();
            return habitacionesDisponibles.get(selectedIndex);
        }

        Habitacion habitacionSeleccionada = habitacionesDisponibles.get(seleccione);

        return habitacionSeleccionada;
    }

    /**
     * private String nombreEmpresa;
     * private String nit;
     * private String direccion;
     * private String telefono;
     * private String correoElectronico;
     */

    private Cliente obtenerDatosCliente() {
        String nombreEmpresa = JOptionPane.showInputDialog("Ingrese el nombre de la empresa:");
        String nit = JOptionPane.showInputDialog("Ingrese el NIT de la empresa:");
        String direccion = JOptionPane.showInputDialog("Ingrese la direccion de la empresa:");
        String telefono = JOptionPane.showInputDialog("Ingrese el numero de telefono de la empresa:");
        String correoElectronico = JOptionPane.showInputDialog("Ingrese correo electrono de la empresa:");
        return new Cliente(nombreEmpresa, nit, direccion, telefono, correoElectronico);
    }

    public void crearReserva() {
        String fechaIngreso = JOptionPane.showInputDialog("Ingrese la fecha de inicio (YYYY-MM-DD):");
        String fechaSalida = JOptionPane.showInputDialog("Ingrese la fecha de fin (YYYY-MM-DD):");

        LocalDate fechaInicio = LocalDate.parse(fechaIngreso);
        LocalDate fechaFin = LocalDate.parse(fechaSalida);

        Cliente cliente = obtenerDatosCliente();
        Hotel hotel = seleccionarHotel();
        if (hotel != null) {
            List<Habitacion> habitacionesReservadas = new ArrayList<>();
            while (true) {
                Habitacion habitacion = seleccionarHabitacionDisponible(hotel, fechaInicio, fechaFin);
                if (!habitacionesReservadas.contains(habitacion)) {
                    habitacionesReservadas.add(habitacion);
                    int seleccionar = JOptionPane.showConfirmDialog(null,
                            "¿Desea agregar otra habitación a la reserva?",
                            "Agregar habitación", JOptionPane.YES_NO_OPTION);
                    if (seleccionar != JOptionPane.YES_OPTION) {
                        break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay habitaciones disponibles en " + hotel.getNombre()
                            + " para las fechas seleccionadas.");
                    break;
                }
            }

            if (!habitacionesReservadas.isEmpty()) {
                Reserva reserva = new Reserva(cliente, hotel, habitacionesReservadas, fechaInicio, fechaFin);
                reservas.add(reserva);
                StringBuilder mensajeReserva = new StringBuilder("Reserva realizada:\n\n");
                mensajeReserva.append("Empresa: ").append(reserva.getCliente().getNombreEmpresa()).append("\n");
                mensajeReserva.append("Cedula: ").append(reserva.getCliente().getCedula()).append("\n");
                mensajeReserva.append("Hotel: ").append(reserva.getHotel().getNombre()).append("\n");
                mensajeReserva.append("Habitaciones:\n");
                for (Habitacion habitacion : reserva.getHabitaciones()) {
                    mensajeReserva.append(" - Habitación #").append(habitacion.getNumeroHabitacion()).append("\n");
                }

                mensajeReserva.append("Fecha de inicio: ").append(reserva.getFechaInicio()).append("\n");
                mensajeReserva.append("Fecha de fin: ").append(reserva.getFechaFin());

                JOptionPane.showMessageDialog(null, mensajeReserva.toString(), "Reserva realizada",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    private Hotel seleccionarHotel() {
        JComboBox<String> hotelComboBox = new JComboBox<>();

        for (Hotel hotel : hoteles) {
            hotelComboBox.addItem(hotel.getNombre());
        }
        int seleccionar = JOptionPane.showConfirmDialog(
                null,
                hotelComboBox,
                "Seleccione un hotel:",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);
        if (seleccionar == JOptionPane.OK_OPTION) {
            int selectedIndex = hotelComboBox.getSelectedIndex();
            return hoteles.get(selectedIndex);
        }

        return seleccionar >= 0 ? hoteles.get(seleccionar) : null;

    }


    public void mostrarMenu() {
        String menu = "";
        int op = 0;
        do {
            menu = "";
            menu += "Sistema de Reservas de Hotel\n";
            menu += "1.- Reservar habitacion \n";
            menu += "2.- Cancelar reserva \n";
            menu += "3.- Ver habitaciones disponibles \n";
            menu += "4.- Salir \n";
            menu += "Elia una opción";
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1:
                    crearReserva();
                    break;
            }
        } while (op != 4);
    }
}
