package main.java.com.poo.conversormonedas;

public class Pais {
    private String nombre;
    private Moneda monedaOficial;

    public Pais(String nombre, Moneda monedaOficial) {
        this.nombre = nombre;
        this.monedaOficial = monedaOficial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Moneda getMonedaOficial() {
        return monedaOficial;
    }

    public void setMonedaOficial(Moneda monedaOficial) {
        this.monedaOficial = monedaOficial;
    }

}
