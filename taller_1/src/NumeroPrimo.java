import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numero, contador = 0;
        System.out.println("Digite um número: ");
        numero = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= numero; i++) {
            if ((numero % i) == 0) {
                contador++;
            }
        }
        if ((contador == 2)) {
            System.out.println("El numero " + numero + " es primo");
        } else {
           System.out.println("El numero " + numero + " no es primo");
        }
    }
}
