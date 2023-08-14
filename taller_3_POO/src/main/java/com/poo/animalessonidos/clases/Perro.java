package main.java.com.poo.animalessonidos.clases;

public class Perro extends Animal{

    public Perro(String nombre, String color, int edad, String raza) {
        super(nombre, color, edad, raza);
    }


    @Override
    public void hacerSonido() {
        System.out.println("El perro " + super.getNombre() + " hace Guuuuaaaauuu. ");
    }
    
}
