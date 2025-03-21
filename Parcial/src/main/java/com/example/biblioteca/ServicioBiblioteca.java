package com.example.biblioteca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ServicioBiblioteca {
    private List<Recurso> recursos;

    public ServicioBiblioteca() {
        this.recursos = new ArrayList<>();
    }

    public void agregarRecurso(Recurso recurso) {
        recursos.add(recurso);
    }

    public void eliminarRecurso(Recurso recurso) {
        recursos.remove(recurso);
    }

    public Collection<Recurso> buscarRecursos(String criterio) {
        List<Recurso> resultados = new ArrayList<>();
        for (Recurso recurso : recursos) {
            if (recurso.coincideConCriterio(criterio)) {
                resultados.add(recurso);
            }
        }
        return resultados;
    }

    public Collection<Recurso> obtenerTodos() {
        return new ArrayList<>(recursos);
    }
}
