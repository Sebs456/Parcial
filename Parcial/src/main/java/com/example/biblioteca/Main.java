package com.example.biblioteca;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ServicioBiblioteca servicio = new ServicioBiblioteca();

        servicio.agregarRecurso(new Libro("El Principito", LocalDateTime.now(), true, LocalDate.of(1943, 4, 6), "Editorial A"));
        servicio.agregarRecurso(new Periodico("El País", LocalDateTime.now(), true, LocalDate.of(2023, 10, 1), "Editorial B"));
        servicio.agregarRecurso(new Computador("PC1", LocalDateTime.now(), true, "Dell", "XPS", "Windows 10"));

        System.out.println("Recursos en la biblioteca:");
        servicio.obtenerTodos().forEach(System.out::println);

        String criterio = "El";
        System.out.println("\nRecursos que coinciden con el criterio '" + criterio + "':");
        servicio.buscarRecursos(criterio).forEach(System.out::println);

        Recurso primerRecurso = servicio.buscarRecursos(criterio).iterator().next();
        servicio.eliminarRecurso(primerRecurso);

        System.out.println("\nRecursos en la biblioteca después de eliminar:");
        servicio.obtenerTodos().forEach(System.out::println);
    }
}