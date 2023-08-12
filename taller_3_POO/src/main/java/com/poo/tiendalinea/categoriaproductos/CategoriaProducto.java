package main.java.com.poo.tiendalinea.categoriaproductos;

public abstract class CategoriaProducto implements Producto {

    protected String nombreCategoria;
    protected String nombreProducto;
    protected String descripcion;
    protected int cantidad;
    protected double precio;

    public CategoriaProducto(String nombreCategoria, String nombreProducto, String descripcion, int cantidad,
            double precio) {
        this.nombreCategoria = nombreCategoria;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
