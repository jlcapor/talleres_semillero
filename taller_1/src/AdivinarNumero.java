import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numeroUsuario = 0, intentos = 0;
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        System.out.println(numeroSecreto);
        System.out.println("Ingrese un número entre 1 y 5");
        do {
            intentos++;
            numeroUsuario = sc.nextInt();
            if (numeroUsuario > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            }
        } while (numeroSecreto != numeroUsuario);

    }
}
