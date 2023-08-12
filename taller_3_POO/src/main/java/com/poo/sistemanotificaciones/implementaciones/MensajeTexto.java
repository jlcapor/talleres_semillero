package main.java.com.poo.sistemanotificaciones.implementaciones;

import main.java.com.poo.sistemanotificaciones.notificaciones.NotificacionMensajeTexto;

public class MensajeTexto extends NotificacionMensajeTexto {

    public MensajeTexto(String numeroCelular, String mensaje) {
        super(numeroCelular, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando el texto: " + this.getMensaje());
        System.out.printf("\t\t%s", this.getNumeroCelular());
    }

}
