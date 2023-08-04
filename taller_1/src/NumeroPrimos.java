import java.util.Scanner;

public class NumeroPrimos {

    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int inicio, fin;
        System.out.println("Ingrese un número de inicio ");
        inicio = sc.nextInt();
        System.out.println("Ingrese un número de fin ");
        fin = sc.nextInt();

        System.out.println("----------------------Numeros primos----------------------");
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }

    }
}
