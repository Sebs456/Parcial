package com.example.biblioteca;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public class ComputadorRepository implements RecursoRepository<Computador> {
    private final List<Computador> computadores = new ArrayList<>();

    @Override
    public void agregar(Computador computador) {
        computadores.add(computador);
    }

    @Override
    public void eliminar(Computador computador) {
        computadores.remove(computador);
    }

    @Override
    public Collection<Computador> buscar(String criterio) {
        Collection<Computador> resultados = new ArrayList<>();
        for (Computador computador : computadores) {
            if (computador.coincideConCriterio(criterio)) {
                resultados.add(computador);
            }
        }
        return resultados;
    }

    @Override
    public Collection<Computador> obtenerTodos() {
        return new ArrayList<>(computadores);
    }
}
/**
 * Principio de Inversión de Control (IoC):
 * En lugar de que las clases creen sus propias dependencias, Spring las inyecta
 * automáticamente. Esto permite un código más modular y fácil de probar.
 */
