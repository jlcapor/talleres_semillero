package main.java.com.poo.tiendalinea;

import main.java.com.poo.tiendalinea.categoriaproductos.Producto;
import main.java.com.poo.tiendalinea.productoespecífico.Camiseta;

public class TiendaEnLinea {
    public static void main(String[] args) {
        Producto camiseta = new Camiseta("Ropa", "Nike Sportswear Club", "Esta playera Nike Club", 2, 200000);
        camiseta.mostrarDetalles();

    }
}
