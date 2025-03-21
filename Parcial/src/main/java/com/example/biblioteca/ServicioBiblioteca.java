package com.example.biblioteca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.ArrayList;

@Service
public class ServicioBiblioteca {
    private final LibroRepository libroRepository;
    private final PeriodicoRepository periodicoRepository;
    private final ComputadorRepository computadorRepository;

    @Autowired
    public ServicioBiblioteca(LibroRepository libroRepository,
                             PeriodicoRepository periodicoRepository,
                             ComputadorRepository computadorRepository) {
        this.libroRepository = libroRepository;
        this.periodicoRepository = periodicoRepository;
        this.computadorRepository = computadorRepository;
    }

    public void agregarRecurso(Recurso recurso) {
        if (recurso instanceof Libro) {
            libroRepository.agregar((Libro) recurso);
        } else if (recurso instanceof Periodico) {
            periodicoRepository.agregar((Periodico) recurso);
        } else if (recurso instanceof Computador) {
            computadorRepository.agregar((Computador) recurso);
        }
    }

    public void eliminarRecurso(Recurso recurso) {
        if (recurso instanceof Libro) {
            libroRepository.eliminar((Libro) recurso);
        } else if (recurso instanceof Periodico) {
            periodicoRepository.eliminar((Periodico) recurso);
        } else if (recurso instanceof Computador) {
            computadorRepository.eliminar((Computador) recurso);
        }
    }

    public Collection<Recurso> buscarRecursos(String criterio) {
        Collection<Recurso> resultados = new ArrayList<>();
        resultados.addAll(libroRepository.buscar(criterio));
        resultados.addAll(periodicoRepository.buscar(criterio));
        resultados.addAll(computadorRepository.buscar(criterio));
        return resultados;
    }

    public Collection<Recurso> obtenerTodos() {
        Collection<Recurso> recursos = new ArrayList<>();
        recursos.addAll(libroRepository.obtenerTodos());
        recursos.addAll(periodicoRepository.obtenerTodos());
        recursos.addAll(computadorRepository.obtenerTodos());
        return recursos;
    }
}
