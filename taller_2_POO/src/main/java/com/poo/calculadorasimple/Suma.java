package main.java.com.poo.calculadorasimple;

public class Suma implements Operacion {

    @Override
    public double calcular(double num1, double num2) {
        return (num1 + num2);
    }

}
