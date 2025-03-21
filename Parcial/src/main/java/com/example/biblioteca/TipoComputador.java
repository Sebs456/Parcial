package com.example.biblioteca;

import java.time.LocalDateTime;

public class TipoComputador extends Recurso {
    private String procesador;
    private int ramGB;
    private int almacenamientoGB;

    public TipoComputador(String nombre, LocalDateTime fechaIngreso, boolean activo, String procesador, int ramGB, int almacenamientoGB) {
        super(nombre, fechaIngreso, activo);
        this.procesador = procesador;
        this.ramGB = ramGB;
        this.almacenamientoGB = almacenamientoGB;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getRamGB() {
        return ramGB;
    }

    public int getAlmacenamientoGB() {
        return almacenamientoGB;
    }

    @Override
    public boolean coincideConCriterio(String criterio) {
        return super.coincideConCriterio(criterio) || procesador.contains(criterio) || String.valueOf(ramGB).contains(criterio) || String.valueOf(almacenamientoGB).contains(criterio);
    }

    @Override
    public String toString() {
        return super.toString() + "\nProcesador=" + procesador + "\nRAM=" + ramGB + "GB\nAlmacenamiento=" + almacenamientoGB + "GB";
    }
}
