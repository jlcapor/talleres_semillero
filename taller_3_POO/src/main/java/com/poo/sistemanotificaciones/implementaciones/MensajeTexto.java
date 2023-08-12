package main.java.com.poo.sistemanotificaciones.implementaciones;

import main.java.com.poo.sistemanotificaciones.notificaciones.NotificacionMensajeTexto;

public class MensajeTexto extends NotificacionMensajeTexto {

    public MensajeTexto(String mensaje) {
        super(mensaje);
    }

    @Override
    public void enviar() {
        throw new UnsupportedOperationException("Unimplemented method 'enviar'");
    }

}
