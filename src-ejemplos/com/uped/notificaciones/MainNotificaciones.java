package com.uped.notificaciones;

public class MainNotificaciones {
    public static void main(String[] args) {
        Notificacion n1 = new NotificacionCorreo("usuario@uped.edu.sv", "Bienvenido al ciclo 02-2026");
        Notificacion n2 = new NotificacionSMS("7777-8888", "Tu código de acceso es 1234");
        Notificacion n3 = new NotificacionPush("iPhone de Edgardo", "Tienes una nueva tarea asignada");

        n1.enviarMensaje();
        n1.registrarHistorial();
        System.out.println("-----------------");

        n2.enviarMensaje();
        n2.registrarHistorial();
        System.out.println("-----------------");

        n3.enviarMensaje();
        n3.registrarHistorial();
    }
}