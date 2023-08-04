package array;

import java.util.Scanner;

public class BuscarElementoArray {

    public static int buscarElemento(int array[], int valor) {
        for (int x = 0; x < array.length; x++) {
            if ((array[x]) == valor) {
                return x;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] elementos = { 50, 21, 6, 97, 18 };
        int valor = 0;
        System.out.println("Digite el valor que desea obtener de la lista : ");
        valor = Integer.parseInt(sc.nextLine());
        int posicion = buscarElemento(elementos, valor);
        if (posicion == -1) {
            System.out.println("El elemento NO existe en el arreglo");
        } else {
            System.out.println("se encuentra en la posición " + posicion);
        }
    }
}
