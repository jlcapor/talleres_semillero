import java.util.Scanner;

public class PalabraPorSeparado {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String palabras = "";
        System.out.println("Ingrese la frase: ");
        palabras = sc.nextLine();
        String[] parts = palabras.split(" ");
        for(String item : parts)
            System.out.println(item);
        }
    
}
