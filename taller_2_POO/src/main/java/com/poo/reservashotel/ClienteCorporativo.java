package main.java.com.poo.reservashotel;

public class ClienteCorporativo extends Cliente {
    private String nombreEmpresa;
    private String numeroContactoEmpresa;
    private double nivelDescuento;
    private String responsableReserva;

    public ClienteCorporativo(String nombre, String apellidos, String cedula, String direccion, String telefono,
            String correoElectronico, String nombreEmpresa, String numeroContactoEmpresa, double nivelDescuento,
            String responsableReserva) {
        super(nombre, apellidos, cedula, direccion, telefono, correoElectronico);
        this.nombreEmpresa = nombreEmpresa;
        this.numeroContactoEmpresa = numeroContactoEmpresa;
        this.nivelDescuento = nivelDescuento;
        this.responsableReserva = responsableReserva;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNumeroContactoEmpresa() {
        return numeroContactoEmpresa;
    }

    public void setNumeroContactoEmpresa(String numeroContactoEmpresa) {
        this.numeroContactoEmpresa = numeroContactoEmpresa;
    }

    public double getNivelDescuento() {
        return nivelDescuento;
    }

    public void setNivelDescuento(double nivelDescuento) {
        this.nivelDescuento = nivelDescuento;
    }

    public String getResponsableReserva() {
        return responsableReserva;
    }

    public void setResponsableReserva(String responsableReserva) {
        this.responsableReserva = responsableReserva;
    }

}
