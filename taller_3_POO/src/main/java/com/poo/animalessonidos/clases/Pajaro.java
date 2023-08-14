package main.java.com.poo.animalessonidos.clases;

public class Pajaro extends Animal {

    public Pajaro(String nombre, String color, int edad, String raza) {
        super(nombre, color, edad, raza);
    }

   
    @Override
    public void hacerSonido() {
        System.out.println("El pájaro " + super.getNombre() + " hace ¡Pío Pío!");
    }

}
