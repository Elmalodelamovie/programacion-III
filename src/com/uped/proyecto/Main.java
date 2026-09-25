package com.uped.proyecto;

import com.uped.proyecto.modelo.Auditoria;
public class Main {
    public static void main(String[] args) {
        Auditoria registro = new Auditoria("Edgardo");

        registro.registrarMovimiento("Inicio de sesión en el sistema");
        registro.registrarMovimiento("Exportación de base de datos");

        registro.getMovimientos().clear();

        System.out.println("Auditor a cargo: " + registro.getResponsable());
        System.out.println("Movimientos seguros en el historial: " + registro.getMovimientos().size());
    }
}