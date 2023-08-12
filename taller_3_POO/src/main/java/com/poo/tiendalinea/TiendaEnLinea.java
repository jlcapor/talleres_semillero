package main.java.com.poo.tiendalinea;

import main.java.com.poo.tiendalinea.categoriaproductos.IProducto;
import main.java.com.poo.tiendalinea.productoespecífico.Camiseta;

public class TiendaEnLinea {
    public static void main(String[] args) {
        IProducto camiseta = new Camiseta("Ropa", "Nike Sportswear Club", "Esta playera Nike Club", 2, 200000);
        System.out.println(camiseta.calcularPrecio());
        camiseta.mostrarDetalles();
    }
}
