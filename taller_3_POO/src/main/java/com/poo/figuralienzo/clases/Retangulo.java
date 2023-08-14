package main.java.com.poo.figuralienzo.clases;

public class Retangulo extends Figura {
    private double ancho;
    private double alto;

    public Retangulo(String colorRelleno, String colorLinea, Punto posicion, double ancho, double alto) {
        super(colorRelleno, colorLinea, posicion);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public void dibujar() {
        System.out.println("--------------------------");
    }

}
