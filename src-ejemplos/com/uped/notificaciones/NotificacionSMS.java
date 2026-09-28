package com.uped.notificaciones;

public class NotificacionSMS extends Notificacion {
    public NotificacionSMS(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando SMS al número " + destinatario + ": " + mensaje);
    }
}