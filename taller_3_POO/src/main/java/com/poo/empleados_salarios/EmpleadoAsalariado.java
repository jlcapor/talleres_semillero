package main.java.com.poo.empleados_salarios;

public class EmpleadoAsalariado extends Empleado {

    private double salarioMensual;

    public EmpleadoAsalariado(String codigo, String nombre, String apellido, String telefono, String correo,
            double salarioMensual) {
        super(codigo, nombre, apellido, telefono, correo);
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tipo: Empleado Asalariado\n" +
                "Salario Mensual: " + salarioMensual + "\n" +
                "Salario Calculado: " + calcularSalario() + "\n";
    }

}
