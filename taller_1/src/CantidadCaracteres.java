import java.util.Scanner;

public class CantidadCaracteres {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cantidadCaracteres = 0;
        System.out.println("Ingrese una cadena : ");
        String cadena = sc.nextLine();
        int cantidad = cadena.length();
        for (int i = 0; i < cantidad; i++) {
            char caracter = cadena.charAt(i);
            if (caracter != ' ') {
                cantidadCaracteres++;
            }
        }

        System.out.println("Cantidad de caracteres : " + cantidadCaracteres);
    }
}
