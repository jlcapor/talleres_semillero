public class NumeroMayorArray {

    public static int maximo(int array[]) {
        int mayor = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }

    public static void main(String[] args) throws Exception {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 50, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        System.out.println("El numero mayor es: " + maximo(array));
    }
}
