package com.example.biblioteca;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class Libro extends Recurso {
    private LocalDate fechaPublicacion;
    private String editorial;

    public Libro(String nombre, LocalDateTime fechaIngreso, boolean activo, LocalDate fechaPublicacion, String editorial) {
        super(nombre, fechaIngreso, activo);
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public boolean coincideConCriterio(String criterio) {
        return super.coincideConCriterio(criterio) || fechaPublicacion.toString().contains(criterio) || editorial.contains(criterio);
    }

    @Override
    public String toString() {
        return super.toString() + "\nFechaPublicacion=" + fechaPublicacion + "\nEditorial=" + editorial;
    }
}
