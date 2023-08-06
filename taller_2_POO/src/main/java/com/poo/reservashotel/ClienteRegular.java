package main.java.com.poo.reservashotel;

public class ClienteRegular extends Cliente {
    private int puntosFidelidad;
    private String nivelMembresia;
    private String preferenciaHabitacion;

    public ClienteRegular(String nombre, String apellidos, String cedula, String direccion, String telefono,
            String correoElectronico, int puntosFidelidad, String nivelMembresia, String preferenciaHabitacion) {
        super(nombre, apellidos, cedula, direccion, telefono, correoElectronico);
        this.puntosFidelidad = puntosFidelidad;
        this.nivelMembresia = nivelMembresia;
        this.preferenciaHabitacion = preferenciaHabitacion;
    }

    public int getPuntosFidelidad() {
        return puntosFidelidad;
    }

    public void setPuntosFidelidad(int puntosFidelidad) {
        this.puntosFidelidad = puntosFidelidad;
    }

    public String getNivelMembresia() {
        return nivelMembresia;
    }

    public void setNivelMembresia(String nivelMembresia) {
        this.nivelMembresia = nivelMembresia;
    }

    public String getPreferenciaHabitacion() {
        return preferenciaHabitacion;
    }

    public void setPreferenciaHabitacion(String preferenciaHabitacion) {
        this.preferenciaHabitacion = preferenciaHabitacion;
    }

}
