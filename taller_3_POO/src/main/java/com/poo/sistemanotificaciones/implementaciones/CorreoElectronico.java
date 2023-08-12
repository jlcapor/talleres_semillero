package main.java.com.poo.sistemanotificaciones.implementaciones;

import main.java.com.poo.sistemanotificaciones.notificaciones.NotificacionCorreoElectronico;

public class CorreoElectronico extends NotificacionCorreoElectronico {

    public CorreoElectronico(String destinatario, String asunto, String mensaje) {
        super(destinatario, asunto, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo electronico a " + getDestinatario());
        System.out.println("Asunto  " + getAsunto());
        System.out.println("Mensaje: \n" + getMensaje());
    }

}
