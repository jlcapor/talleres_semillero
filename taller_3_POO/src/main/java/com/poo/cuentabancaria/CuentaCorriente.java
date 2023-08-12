package main.java.com.poo.cuentabancaria;

public class CuentaCorriente extends Cuenta {
    private double cupoCuenta;

    public CuentaCorriente(String numero, double cupoCuenta) {
        super(numero);
        this.cupoCuenta = cupoCuenta;
    }

    public double getCupoCuenta() {
        return cupoCuenta;
    }

    public void setCupoCuenta(double cupoCuenta) {
        this.cupoCuenta = cupoCuenta;
    }

    @Override
    public boolean retirar(double cantidad) {

        if ((this.saldo + cupoCuenta) >= cantidad) {
            this.saldo -= cantidad;
            return true;
        }
        return false;
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

}