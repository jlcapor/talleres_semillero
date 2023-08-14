package main.java.com.poo.figurasgeometricas;

public class FigurasGeometrica {
    public static void main(String[] args) {
        Figura circulo, cuadrado, triangulo;

        System.out.println("---------Circulo---------");
        circulo = new Circulo(5.0);
        System.out.println("Area del círculo: " + circulo.calcularArea());
        System.out.println("Perimetro del círculo: " + circulo.calcularArea());

        System.out.println("---------Cuadrado--------");
        cuadrado = new Cuadrado(10, 20);
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado: " + cuadrado.calcularPerimetro());

        System.out.println("---------Triangulo--------");
        triangulo = new Triangulo(6, 12, 5.0, 10.2, 8.0);
        System.out.println("Area del triángulo: " + triangulo.calcularArea());
        System.out.println("Perimetro del triángulo:" + triangulo.calcularPerimetro());

    }
}
