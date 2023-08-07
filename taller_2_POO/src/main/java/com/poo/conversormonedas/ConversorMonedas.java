package main.java.com.poo.conversormonedas;

public class ConversorMonedas {


    public double convertirMoneda(double cantidad, Pais paisOrigen, Pais paisDestino) {
        Moneda monedaOrigen = paisOrigen.getMonedaOficial();
        Moneda monedaDestino = paisDestino.getMonedaOficial();
        double cantidadEnDolares = cantidad / monedaOrigen.getTasaCambio();
        return cantidadEnDolares * monedaDestino.getTasaCambio();
    }
}
