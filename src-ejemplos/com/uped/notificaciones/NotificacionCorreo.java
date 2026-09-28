package com.uped.notificaciones;

public class NotificacionCorreo extends Notificacion {
    public NotificacionCorreo(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando Email a " + destinatario + ": " + mensaje);
    }
}