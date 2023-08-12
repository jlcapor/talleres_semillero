package main.java.com.poo.sistemanotificaciones.notificaciones;

public abstract class NotificacionPush implements INotificacion {
    protected String titulo;
    protected String mensaje;

    public NotificacionPush(String titulo, String mensaje) {
        this.titulo = titulo;
        this.mensaje = mensaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
