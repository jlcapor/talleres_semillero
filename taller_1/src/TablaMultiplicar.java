import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n, multiplicar;
        System.out.println("Ingrese un numero: ");
        n = sc.nextInt();
        for (int i = 0; i <= 10; ++i) {
            multiplicar = n * i;
            System.out.println(n + " * " + i + " = " + multiplicar);
        }
    }
}
