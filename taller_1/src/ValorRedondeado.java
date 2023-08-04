import java.util.Scanner;

public class ValorRedondeado {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        double valor, resultado;
        System.out.println("Digite um número: ");
        valor=input.nextDouble();
        resultado = Math.round(valor);
        System.out.println(resultado);

    }
}
