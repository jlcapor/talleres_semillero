package main.java.com.poo.sistemanotificaciones.notificaciones;

public abstract class NotificacionMensajeTexto implements INotificacion {
    private String mensaje;

    public NotificacionMensajeTexto(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
