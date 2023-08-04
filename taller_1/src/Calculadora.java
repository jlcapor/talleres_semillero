import java.util.Scanner;

public class Calculadora {

    public static int sumar(int a, int b) {
        int suma = 0;
        suma = a + b;
        return suma;
    }

    public static int resta(int a, int b) {
        int resta = 0;
        resta = b - a;
        return resta;
    }

    public static int multiplicacion(int a, int b) {
        int multi = 0;
        multi = b * a;
        return multi;
    }

    public static double division(int a, int b) {
        double dividir = 0.0;
        try {
            dividir = a / b;
        } catch (Exception e) {
            System.out.println("No se puede realizar la operación de División por cero");
        }
        return dividir;
    }

    public static void main(String[] args) throws Exception {
        int suma, resta, mult;
        double division = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un primer numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro número ");
        int num2 = sc.nextInt();
        suma = sumar(num1, num2);
        resta = resta(num2, num2);
        mult = multiplicacion(num1, num2);
        division = division(num1, num2);

        System.out.println("Suma :  " + suma);
        System.out.println("Resta :  " + resta);
        System.out.println("Multiplicacion :  " + mult);
        System.out.println("Division :  " + division);
    }
}
