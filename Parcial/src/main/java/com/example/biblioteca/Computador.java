package com.example.biblioteca;
import java.time.LocalDateTime;
public class Computador extends Recurso {
    private String marca;
    private String modelo;
    private String sistemaOperativo;

    public Computador(String nombre, LocalDateTime fechaIngreso, boolean activo, String marca, String modelo, String sistemaOperativo) {
        super(nombre, fechaIngreso, activo);
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    @Override
    public boolean coincideConCriterio(String criterio) {
        return super.coincideConCriterio(criterio) || marca.contains(criterio) || modelo.contains(criterio) || sistemaOperativo.contains(criterio);
    }

    @Override
    public String toString() {
        return super.toString() + "\nMarca=" + marca + "\nModelo=" + modelo + "\nSistemaOperativo=" + sistemaOperativo;
    }
}