package main.java.com.poo.figuralienzo.clases;

import main.java.com.poo.figuralienzo.interfaces.Dibujable;

public abstract class Figura implements Dibujable {
    private String colorRelleno;
    private String colorLinea;
    private Punto posicion;

    public Figura(String colorRelleno, String colorLinea, Punto posicion) {
        this.colorRelleno = colorRelleno;
        this.colorLinea = colorLinea;
        this.posicion = posicion;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public String getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }

    public Punto getPosicion() {
        return posicion;
    }

    public void setPosicion(Punto posicion) {
        this.posicion = posicion;
    }

}
