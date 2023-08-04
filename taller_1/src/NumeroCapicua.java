import java.util.Scanner;

public class NumeroCapicua {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int num, aux = 0, cifra = 0, inverso = 0;
        System.out.println("Digite um número: ");
        num = in.nextInt();
        aux = num;
        while (aux != 0) {
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }

        if (num == inverso) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }
}
