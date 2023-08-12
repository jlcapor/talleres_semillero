package main.java.com.poo.juegocartas.implementacion;

import main.java.com.poo.juegocartas.contrato.Carta;

public class CartaPoker implements Carta {

    private static final String STRING_RANK_CARDS = "23456789TJQKA";

    public static enum Palo {
        SPADE('♠'), HEART('♥'), DIAMOND('♦'), CLUB('♣');

        private Palo(char c) {
            this.c = c;
        }

        private final char c;
    }

    public enum Valor {
        TWO, TRHEE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    private final Palo palo;
    private final Valor valor;

    public CartaPoker(Palo palo, Valor valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public Valor getValor() {
        return valor;
    }

    @Override
    public void mostrarCarta() {
        System.out.println("Carta: " + valor + " de " + palo);
    }

    @Override
    public int valorNumerico() {
        return valor.ordinal() + 1;
    }

    @Override
    public String toString() {
        return STRING_RANK_CARDS.substring(valor.ordinal(), valor.ordinal() + 1) + palo.c;
    }

}
