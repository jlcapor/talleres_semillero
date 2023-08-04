import java.util.Scanner;
import java.util.StringTokenizer;

public class CuantasPalbras {

    
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        String oracion = "";
        System.out.println("Ingrese la oracion: ");
        oracion = in.nextLine();
        StringTokenizer st = new StringTokenizer(oracion);
        System.out.println("Número de palabras: " + st.countTokens());
    }
}
