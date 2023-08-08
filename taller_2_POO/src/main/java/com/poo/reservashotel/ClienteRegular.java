package main.java.com.poo.reservashotel;

public class ClienteRegular extends Cliente {
    private int puntosFidelidad;
    private int numeroVisitas;
    private String nivelMembresia;

    public ClienteRegular(String nombre, String apellidos, String cedula, String direccion, String telefono,
            String correoElectronico, int puntosFidelidad, int numeroVisitas, String nivelMembresia) {
        super(nombre, apellidos, cedula, direccion, telefono, correoElectronico);
        this.puntosFidelidad = puntosFidelidad;
        this.numeroVisitas = numeroVisitas;
        this.nivelMembresia = nivelMembresia;
    }

    public int getPuntosFidelidad() {
        return puntosFidelidad;
    }

    public void setPuntosFidelidad(int puntosFidelidad) {
        this.puntosFidelidad = puntosFidelidad;
    }

    public int getNumeroVisitas() {
        return numeroVisitas;
    }

    public void setNumeroVisitas(int numeroVisitas) {
        this.numeroVisitas = numeroVisitas;
    }

    public String getNivelMembresia() {
        return nivelMembresia;
    }

    public void setNivelMembresia(String nivelMembresia) {
        this.nivelMembresia = nivelMembresia;
    }

}
