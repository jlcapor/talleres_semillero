package main.java.com.poo.sistemanotificaciones;

import main.java.com.poo.sistemanotificaciones.implementaciones.CorreoElectronico;
import main.java.com.poo.sistemanotificaciones.implementaciones.MensajeTexto;
import main.java.com.poo.sistemanotificaciones.implementaciones.Push;
import main.java.com.poo.sistemanotificaciones.notificaciones.INotificacion;

public class SistemaNotificaciones {
    public static void main(String[] args) throws Exception {
        INotificacion correo = new CorreoElectronico("usuario@example.com", "Taller 3", "Entrga taller 3");
        correo.enviar();

        INotificacion mensajeTexto = new MensajeTexto("+323567890",
                "Felicidades, has ganado un cupon de descuento del 20% en tu proxima compra");
        mensajeTexto.enviar();

        INotificacion push = new Push("Actualizacion", "Nueva actualizaci\u00F3n disponible. \u00A1Haz clic para descargar!");
        push.enviar();
    }
}
