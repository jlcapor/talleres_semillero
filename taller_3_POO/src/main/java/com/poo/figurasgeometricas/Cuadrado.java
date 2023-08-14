package main.java.com.poo.figurasgeometricas;

public class Cuadrado implements Figura {
    private double x;
    private double y;

    public Cuadrado(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double calcularArea() {
        return x * y;
    }

    @Override
    public double calcularPerimetro() {
        return x * 4;
    }

}
