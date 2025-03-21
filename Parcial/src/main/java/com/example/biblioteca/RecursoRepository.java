package com.example.biblioteca;

import java.util.Collection;

public interface RecursoRepository<T extends Recurso> {
    void agregar(T recurso);
    void eliminar(T recurso);
    Collection<T> buscar(String criterio);
    Collection<T> obtenerTodos();
}
