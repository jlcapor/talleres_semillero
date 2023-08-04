import java.util.Scanner;

public class Area {
    public static void main(String[] args) throws Exception {
        /*
         * 3.Crea un programa que calcule y muestre el área y el perímetro de
         * un círculo. El usuario debe proporcionar el radio del círculo.
         * 
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Radio");
        int radio = sc.nextInt();

        double area = Math.PI * Math.pow(radio, 2);
        double perímetro = 2 * Math.PI * radio;
        
        System.out.println("El área del circulo es de " + area);
        System.out.println("El perimetro del circulo es de " + perímetro);

    }
}
