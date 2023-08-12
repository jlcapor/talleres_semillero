package main.java.com.poo.tiendalinea.productoespecífico;

import main.java.com.poo.tiendalinea.categoriaproductos.Ropa;

public class Camiseta extends Ropa {

    public Camiseta(String nombreCategoria, String nombreProducto, String descripcion, int cantidad, double precio) {
        super(nombreCategoria, nombreProducto, descripcion, cantidad, precio);
    }

    @Override
    public double calcularPrecio() {
        return precio * cantidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Categoría: " + nombreCategoria);
        System.out.println("Nombre: " + nombreProducto);
        System.out.println("Precio: $" + calcularPrecio());
    }

}
