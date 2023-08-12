package main.java.com.poo.cuentabancaria;

import javax.swing.JOptionPane;

public class OperacionesBanco {
    private Banco banco;

    public OperacionesBanco() {
        this.banco = new Banco();
    }

    public void menuOpciones() {
        int opcion;
        do {
            opcion = 0;
            String valorSeleccionado = JOptionPane.showInputDialog("OPERACIONES BANCARIAS \n" +
                    "1. Crear nueva cuenta \n" +
                    "2. Consultar el total de dinero en el banco \n" +
                    "0. Terminar \n\n" +
                    "Ingrese el número correspondiente a la opción: ");
            // Verifica que no se haya presionado "Cancelar"
            if (valorSeleccionado != null) {
                opcion = Integer.parseInt(valorSeleccionado);
            }

            switch (opcion) {
                case 1 -> crearCuenta();
            }

        } while (opcion != 0);
    }

    public void crearCuenta() {

        Cuenta bancaria;
        String tipoCuenta = JOptionPane.showInputDialog("¿Corriente o Ahorros?");
        String numeroCuenta = JOptionPane.showInputDialog("Número cuenta:");
        if (tipoCuenta.equalsIgnoreCase("Corriente")) {
            String cupoCadena = JOptionPane.showInputDialog("Cupo sobregiro");
            double sobregiro = Double.parseDouble(cupoCadena);
            bancaria = new CuentaCorriente(numeroCuenta, sobregiro);
        } else {
            bancaria = new CuentaAhorros(numeroCuenta);
        }
        bancaria.depositar(350000);
        bancaria.retirar(120000);
        double saldo = bancaria.getSaldo();
        JOptionPane.showMessageDialog(null, "Saldo: $" + saldo);

    }

    public void consultarTotal() {
        double totalDinero = banco.consultarTotalDinero();
        JOptionPane.showMessageDialog(null,
                "El total de dinero en el banco es: $" + totalDinero);
    }

}
