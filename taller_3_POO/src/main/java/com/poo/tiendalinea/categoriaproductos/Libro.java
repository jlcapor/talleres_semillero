package main.java.com.poo.tiendalinea.categoriaproductos;

public abstract class Libro extends CategoriaProducto{

    public Libro(String nombreCategoria, String nombreProducto, String descripcion, int cantidad, double precio) {
        super(nombreCategoria, nombreProducto, descripcion, cantidad, precio);
    }


}
