import java.security.SecureRandom;

public class ContrasenaAleatoria {

    public static String generarContasena(String contasena) {
        int longitud = 8;
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longitud; ++i) {
            int randomIndex = random.nextInt(contasena.length());
            sb.append(contasena.charAt(randomIndex));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        String contrasena = generarContasena("wer456$_");
        System.out.println("La contraseña es: " + contrasena);
    }
}
