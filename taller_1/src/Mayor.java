import java.util.Scanner;

public class Mayor {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero ");
        num2 = sc.nextInt();
        if (num1 > num2)
            System.out.println(num1 + " es mayor que " + num2);
        else
            System.out.println(num2 + " es mayor que " + num1);
    }
}
