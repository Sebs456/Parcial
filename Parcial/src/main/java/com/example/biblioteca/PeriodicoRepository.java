package com.example.biblioteca;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public class PeriodicoRepository implements RecursoRepository<Periodico> {
    private final List<Periodico> periodicos = new ArrayList<>();

    @Override
    public void agregar(Periodico periodico) {
        periodicos.add(periodico);
    }

    @Override
    public void eliminar(Periodico periodico) {
        periodicos.remove(periodico);
    }

    @Override
    public Collection<Periodico> buscar(String criterio) {
        Collection<Periodico> resultados = new ArrayList<>();
        for (Periodico periodico : periodicos) {
            if (periodico.coincideConCriterio(criterio)) {
                resultados.add(periodico);
            }
        }
        return resultados;
    }

    @Override
    public Collection<Periodico> obtenerTodos() {
        return new ArrayList<>(periodicos);
    }
}
