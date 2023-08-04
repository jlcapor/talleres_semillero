import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.printf("%d es par", num);
        } else {
            System.out.printf("%d es impar ", num);
        }

    }
}
