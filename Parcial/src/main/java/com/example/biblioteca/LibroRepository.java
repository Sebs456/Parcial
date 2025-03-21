package com.example.biblioteca;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public class LibroRepository implements RecursoRepository<Libro> {
    private final List<Libro> libros = new ArrayList<>();

    @Override
    public void agregar(Libro libro) {
        libros.add(libro);
    }

    @Override
    public void eliminar(Libro libro) {
        libros.remove(libro);
    }

    @Override
    public Collection<Libro> buscar(String criterio) {
        Collection<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.coincideConCriterio(criterio)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    @Override
    public Collection<Libro> obtenerTodos() {
        return new ArrayList<>(libros);
    }
}