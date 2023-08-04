import java.util.Scanner;

public class Palíndromo {
    public static boolean invertirCadena(String cadena) {
        int n = cadena.length();
        cadena = cadena.toLowerCase();
        int i = 0;
        while (i < n) {
            if (cadena.charAt(i) != cadena.charAt(n - 1)) {
                return false;
            }
            i++;
            n--;
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String palabra = "";
        System.out.println("Digite uma frase: ");
        palabra = sc.nextLine();
        boolean cadenaInvertida = invertirCadena(palabra);
        System.out.println(cadenaInvertida);
    }
}
