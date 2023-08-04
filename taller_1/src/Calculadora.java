import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        int suma, resta, mult, division;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un primer numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro número ");
        int num2 = sc.nextInt();
        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        division = num1 / num2;

        System.out.println("Suma :  " + suma);
        System.out.println("Resta :  " + resta);
        System.out.println("Multiplicacion :  " + mult);
        System.out.println("Division :  " + division);
    }
}
