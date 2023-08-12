package main.java.com.poo.figurasgeometricas.implementacion;

import main.java.com.poo.figurasgeometricas.contrato.FiguraGeometrica;

public class Cuadrado implements FiguraGeometrica {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

}
