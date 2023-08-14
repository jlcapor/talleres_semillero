package main.java.com.poo.animalessonidos;

import main.java.com.poo.animalessonidos.clases.Animal;
import main.java.com.poo.animalessonidos.clases.Gato;
import main.java.com.poo.animalessonidos.clases.Pajaro;
import main.java.com.poo.animalessonidos.clases.Perro;

public class AnimalSonido {
    public static void main(String[] args) {
        Animal[] animales = new Animal[3];
        animales[0] = new Perro("Bruno","Cafe", 13, "Pinscher Miniatura");
        animales[1] = new Gato("Figaro", "gris", 4, "Gato siberiano");
        animales[2] = new Pajaro("Blanquita", "Blanco", 3, "Guacamayo");
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
