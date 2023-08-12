package main.java.com.poo.figurasgeometricas.implementacion;

import main.java.com.poo.figurasgeometricas.contrato.FiguraGeometrica;

public class Circulo implements FiguraGeometrica {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * this.radio * this.radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

}
