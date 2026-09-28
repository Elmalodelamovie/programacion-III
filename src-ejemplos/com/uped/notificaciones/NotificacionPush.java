package com.uped.notificaciones;

public class NotificacionPush extends Notificacion {
    public NotificacionPush(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando Notificación Push al dispositivo " + destinatario + ": " + mensaje);
    }
}