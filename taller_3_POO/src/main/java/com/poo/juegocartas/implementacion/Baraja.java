package main.java.com.poo.juegocartas.implementacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Baraja {
    private List<CartaPoker> cartas;
    private int index = 0;

    public Baraja() {
        this.cartas = getCartas();
    }

    public CartaPoker obtenerCarta() {
        CartaPoker resultado = null;
        if (index < cartas.size()) {
            resultado = cartas.get(index);
            index++;
        }
        return resultado;
    }

    public void barajar() {
        index = 0;
        Collections.shuffle(this.cartas);
    }

    public List<CartaPoker> getCartas() {
        int munCartas = CartaPoker.Palo.values().length * CartaPoker.Valor.values().length;
        List<CartaPoker> resultado = new ArrayList<>(munCartas);
        for (CartaPoker.Palo palo : CartaPoker.Palo.values()) {
            for (CartaPoker.Valor valor : CartaPoker.Valor.values()) {
                resultado.add(new CartaPoker(palo, valor));
            }

        }
        return resultado;
    }

    @Override
    public String toString() {
        return String.join("{class:'Deck', index:", Integer.toString(index), ", cards:", cartas.toString(), "'");
    }
}
