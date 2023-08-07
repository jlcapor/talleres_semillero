package main.java.com.poo.alumnos;

public class Calificacion {
    private double valor;
    private Asignatura asignatura;

    public Calificacion(double valor, Asignatura asignatura) {
        this.valor = valor;
        this.asignatura = asignatura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return asignatura.getNombre() + ": " + valor;
    }

}
