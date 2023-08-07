package main.java.com.poo.conversormonedas;

public class Moneda {
    private String codigoMoneda;
    private double tasaCambio;

    public Moneda(String codigoMoneda, double tasaCambio) {
        this.codigoMoneda = codigoMoneda;
        this.tasaCambio = tasaCambio;
    }

    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public double getTasaCambio() {
        return tasaCambio;
    }

    public void setTasaCambio(double tasaCambio) {
        this.tasaCambio = tasaCambio;
    }

}
