package main.java.com.poo.cuentabancaria;

public class CuentaAhorros extends Cuenta {
    private double interesMensual;

    public CuentaAhorros(String numero) {
        super(numero);
        this.interesMensual = 0.006;
    }

    @Override
    public boolean retirar(double cantidad) {
        if ((this.getSaldo() - 20000) >= cantidad) {
            this.saldo = this.saldo - cantidad;
            return true;
        }
        return false;
    }

    public double consultarSaldo() {
        return super.getSaldo();
    }

    public double calcularIntereses() {
        double intereses = (saldo * interesMensual) / 12;
        return intereses;
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

}
