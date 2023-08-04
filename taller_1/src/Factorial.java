import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Indicar un numero para calcular su factorial");
        int numero = sc.nextInt();
        for (int i = numero; i > 0; i--) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
