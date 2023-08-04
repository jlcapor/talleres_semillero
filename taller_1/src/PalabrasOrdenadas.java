import java.util.Arrays;
import java.util.Scanner;

public class PalabrasOrdenadas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String frase = "";
        System.out.println("Introduce una frase");
        frase = sc.nextLine();

        String[] palabras = frase.split(" ");
        
        Arrays.sort(palabras);
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }
}
