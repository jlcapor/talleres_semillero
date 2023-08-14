package main.java.com.poo.figuralienzo.clases;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String colorRelleno, String colorLinea, Punto posicion, double radio) {
        super(colorRelleno, colorLinea, posicion);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Color de Línea " + this.getColorLinea() +
                " Color de Relleno " + this.getColorRelleno() +
                " Punto: " + this.getPosicion().toString());

    }

}
