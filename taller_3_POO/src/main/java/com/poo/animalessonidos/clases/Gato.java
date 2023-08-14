package main.java.com.poo.animalessonidos.clases;

public class Gato extends Animal {

    public Gato(String nombre, String color, int edad, String raza) {
        super(nombre, color, edad, raza);
    }

   

    @Override
    public void hacerSonido() {
        System.out.println("El gato " + super.getNombre() + " hace ¡Miau Miau!");
    }

}
