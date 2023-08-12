package main.java.com.poo.sistemanotificaciones.notificaciones;

public abstract class NotificacionMensajeTexto implements INotificacion {
    private String numeroCelular;
    private String mensaje;

    

    public NotificacionMensajeTexto(String numeroCelular, String mensaje) {
        this.numeroCelular = numeroCelular;
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

}
