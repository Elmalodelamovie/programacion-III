package com.uped.semana10;

public class MainNotificaciones {
    public static void main(String[] args) {
        GestorNotificaciones gestor = new GestorNotificaciones();

        Notificacion correo = new NotificacionEmail("castellanosedgardo@uped.edu.sv", "Tarea calificada");
        Notificacion sms = new NotificacionSMS("70011223", "Su pago fue confirmado hoy");
        Notificacion push = new NotificacionPush("dispositivo-102", "Nuevo mensaje", 3);

        gestor.notificar(correo);
        gestor.notificar(sms, 2);
        gestor.notificar(push, true);
        gestor.notificar("72244455", "Recordatorio de clase");
    }
}