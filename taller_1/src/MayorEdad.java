import java.util.Scanner;

public class MayorEdad {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        if ((edad >= 18)) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
    }
}
