package main.java.com.poo.figuralienzo.clases;

import main.java.com.poo.figuralienzo.interfaces.Dibujable;

public class Lienzo {
    private Dibujable[] dibujables;

    public Lienzo(Dibujable[] dibujables) {
        this.dibujables = dibujables;
    }

    public void dibujarFiguras() {
        for (Dibujable dibujable : dibujables) {
            dibujable.dibujar();
        }
    }
}
