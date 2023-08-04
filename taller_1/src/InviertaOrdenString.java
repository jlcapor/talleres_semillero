public class InviertaOrdenString {
    public static void main(String[] args) throws Exception {
        String cadena = "Semillero Frontend y Backend";
        String invertida = "";
        System.out.println("Cadena original: " + cadena);
        for (int indice = cadena.length() - 1; indice >= 0; indice--) {
            invertida += cadena.charAt(indice);
        }
        System.out.println("Cadena invertida: " + invertida);
    }
}
