package com.uped.notificaciones;

public abstract class Notificacion {
    protected String destinatario;
    protected String mensaje;

    public Notificacion(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    public abstract void enviarMensaje();

    public final void registrarHistorial() {
        System.out.println("Historial guardado: Mensaje enviado a " + destinatario);
    }
}