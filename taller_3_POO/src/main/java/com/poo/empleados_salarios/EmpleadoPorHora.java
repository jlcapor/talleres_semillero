package main.java.com.poo.empleados_salarios;

public class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    private double montoPorHora;

    public EmpleadoPorHora(String codigo, String nombre, String apellido, String telefono, String correo,
            int horasTrabajadas, double montoPorHora) {
        super(codigo, nombre, apellido, telefono, correo);
        this.horasTrabajadas = horasTrabajadas;
        this.montoPorHora = montoPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getMontoPorHora() {
        return montoPorHora;
    }

    public void setMontoPorHora(double montoPorHora) {
        this.montoPorHora = montoPorHora;
    }

    @Override
    public double calcularSalario() {
        return montoPorHora * horasTrabajadas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tipo: Empleado por Horas\n" +
                "Horas Trabajadas: " + horasTrabajadas + "\n" +
                "Salario por Hora: " + montoPorHora + "\n" +
                "Salario Calculado: " + calcularSalario() + "\n";
    }

}
