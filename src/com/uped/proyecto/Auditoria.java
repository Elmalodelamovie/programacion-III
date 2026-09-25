package com.uped.proyecto.modelo;

import java.util.ArrayList;
import java.util.List;

public class Auditoria {
    private final String responsable;
    private final List<String> movimientos;

    public Auditoria(String responsable) {
        if (responsable == null || responsable.isBlank()) {
            throw new IllegalArgumentException("El responsable no puede estar vacío.");
        }
        this.responsable = responsable;
        this.movimientos = new ArrayList<>();
    }

    public void registrarMovimiento(String movimiento) {
        movimientos.add(movimiento);
    }

    public List<String> getMovimientos() {
        return new ArrayList<>(movimientos);
    }

    public String getResponsable() {
        return responsable;
    }
}