package main.java.com.poo.calculadorasimple;

public class Calculadora {
    private Operacion operacion;

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    public double calcular(double num1, double num2) {
        return operacion.calcular(num1, num2);
    }

}
