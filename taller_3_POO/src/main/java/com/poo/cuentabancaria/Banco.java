package main.java.com.poo.cuentabancaria;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private ArrayList<Cuenta> cuentas;

    public Banco() {
        this.nombre = "MuchoDinero";
        this.cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public Cuenta buscarCuenta(String numero) {
        for (Cuenta cuentaComparar : cuentas) {
            if (cuentaComparar.getNumero().equals(numero)) {
                return cuentaComparar;
            }
        }
        return null;
    }

    public boolean adicionarCuentaAhorros(String numero) {
        Cuenta cuentaExistente = buscarCuenta(numero);
        if (cuentaExistente == null) {
            Cuenta nuevaCuenta = new CuentaAhorros(numero);
            return cuentas.add(nuevaCuenta);
        }
        return false;
    }

    public boolean adicionarCuentaCorriente(String numero,
            double cupoSobregiro) {
        Cuenta cuentaExistente = buscarCuenta(numero);
        if (cuentaExistente == null) {
            Cuenta nuevaCuenta = new CuentaCorriente(numero, cupoSobregiro);
            return cuentas.add(nuevaCuenta);
        }
        return false;
    }

    public boolean retirar(String numeroCuenta, double cantidad) {
        Cuenta cuenta = buscarCuenta(numeroCuenta);
        if (cuenta != null) {
            return cuenta.retirar(cantidad);
        }
        return false;
    }

    public double consultarTotalDinero() {
        double cantidadDinero = 0;
        for (Cuenta cuenta : cuentas) {
            cantidadDinero += cuenta.getSaldo();
        }
        return cantidadDinero;
    }

}
