package main.java.com.poo.cuentabancaria;

public abstract class Cuenta {
    private String numero;
    protected double saldo;

    public Cuenta(String numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void depositar(double monto);

    public abstract boolean retirar(double monto);
}
