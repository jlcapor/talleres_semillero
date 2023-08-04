import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do lado 1: ");
        double a = input.nextDouble();
        System.out.println("Digite o valor do lado 2: ");
        double b = input.nextDouble();
        System.out.println("Digite o valor da base: ");
        double c = input.nextDouble();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - c));
        System.out.println("El area del triangulo es:" + area);
    }
}
