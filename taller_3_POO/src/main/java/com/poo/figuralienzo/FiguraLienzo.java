package main.java.com.poo.figuralienzo;

import main.java.com.poo.figuralienzo.clases.Circulo;
import main.java.com.poo.figuralienzo.clases.Figura;
import main.java.com.poo.figuralienzo.clases.Lienzo;
import main.java.com.poo.figuralienzo.clases.Punto;
import main.java.com.poo.figuralienzo.clases.Retangulo;
import main.java.com.poo.figuralienzo.interfaces.Dibujable;

/**
 * String colorRelleno, String colorLinea, Punto posicion, double ancho, double
 * alto
 */
public class FiguraLienzo {
    public static void main(String[] args) throws Exception {
        Punto posicionCirculo = new Punto(10, 20);
        Punto posicionRectangulo = new Punto(30, 40);

        Figura fig1 = new Circulo("azul", "negro", posicionCirculo, 5.0);
        Figura fig2 = new Retangulo("azul", "negro", posicionRectangulo, 5.0, 10.2);
        Dibujable[] figuras = { fig1, fig2 };
        Lienzo lienzo=new Lienzo(figuras);
        lienzo.dibujarFiguras();

    }
}
