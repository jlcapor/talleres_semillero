package main.java.com.poo.empleados_salarios;

public class EmpleadoSalario {
    public static void main(String[] args) throws Exception {
        Empleado [] empleados=new Empleado[2];
        empleados[0] = new EmpleadoAsalariado("EM12345", "Jorge Luis", "Rojas Camello", "3234567890", "carreo@correo.com", 2000000);
        empleados[1] = new EmpleadoPorHora("EM9870456", "Diana Julith", "Zapata", "454678908", "carreo2@correo.com", 10, 10000.0);

        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}
