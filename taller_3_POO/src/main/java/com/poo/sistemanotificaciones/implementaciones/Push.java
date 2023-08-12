package main.java.com.poo.sistemanotificaciones.implementaciones;

import main.java.com.poo.sistemanotificaciones.notificaciones.NotificacionPush;

public class Push extends NotificacionPush{

    public Push(String titulo, String mensaje) {
        super(titulo, mensaje);
    }

    @Override
    public void enviar() {
        throw new UnsupportedOperationException("Unimplemented method 'enviar'");
    }
    
}
