package main.java.com.poo.sistemanotificaciones.implementaciones;

import main.java.com.poo.sistemanotificaciones.notificaciones.NotificacionCorreoElectronico;

public class CorreoElectronico extends NotificacionCorreoElectronico {

    public CorreoElectronico(String destinatario, String asunto, String mensaje) {
        super(destinatario, asunto, mensaje);
    }

    @Override
    public void enviar() {
        throw new UnsupportedOperationException("Unimplemented method 'enviar'");
    }

}
