package main.java.com.poo.juegocartas.implementacion;

import java.util.List;

import main.java.com.poo.juegocartas.contrato.Carta;


public class JuegoCartas {

    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        List<CartaPoker> allCards = baraja.getCartas();
        for (Carta carta : allCards) {
           carta.mostrarCarta();
        }
    }
}
