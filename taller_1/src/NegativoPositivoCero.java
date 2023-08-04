import java.util.Scanner;

public class NegativoPositivoCero {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduzca un número entero: ");
        numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número  es 0");
        }
    }
}
