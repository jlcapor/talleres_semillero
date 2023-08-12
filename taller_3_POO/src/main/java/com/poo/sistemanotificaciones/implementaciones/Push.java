package main.java.com.poo.sistemanotificaciones.implementaciones;

import main.java.com.poo.sistemanotificaciones.notificaciones.NotificacionPush;

public class Push extends NotificacionPush {

    public Push(String titulo, String mensaje) {
        super(titulo, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificacion push");
        System.out.println("Titulo  " + getTitulo());
        System.out.println("Mensaje  " + getMensaje());
    }

}
