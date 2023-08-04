import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n, i = 1, suma = 0;
        System.out.print("Ingrese un numero: ");
        n = sc.nextInt();
        while (i < n) {
            if ((n % i == 0)) {
                suma = suma + i;
            }

            i++;
        }

        if (suma == n) { 
            System.out.println("El numero es perfecto");
        } else {
            System.out.println("El numero no es perfecto");

        }
    }
}
