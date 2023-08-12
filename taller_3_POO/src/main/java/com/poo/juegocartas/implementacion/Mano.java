package main.java.com.poo.juegocartas.implementacion;

public final class Mano {
    public static final int CARTAS = 5;

    public enum Type {
        HIGH_CARD,
        ONE_PAIR,
        TWO_PAIR,
        THREE_OF_A_KIND,
        STRAIGHT,
        FLUSH,
        FULL_HOUSE,
        FOUR_OF_A_KIND,
        STRAIGHT_FLUSH
    }

    private Mano() {
    }

}
