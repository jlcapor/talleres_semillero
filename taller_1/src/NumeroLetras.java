import java.util.Scanner;

public class NumeroLetras {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String texto;
        char caracter;
        System.out.println("Introduce texto: ");
        texto = teclado.nextLine();
        System.out.print("Introduce un carácter: ");
        caracter = (char) System.in.read();

        int posicion, contador = 0;
        posicion = texto.indexOf(caracter);
        while ((posicion != -1)) {
            contador++;
            posicion = texto.indexOf(caracter, posicion + 1);
            System.out.println(posicion);
        }

        System.out.println("El caracter " + caracter + " aparece " + contador + " veces");
    }
}
