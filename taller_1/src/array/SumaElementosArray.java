package array;
public class SumaElementosArray {
    public static void main(String[] args) throws Exception {
        int suma = 0;
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        for (int i = 0; i < array.length; ++i) {
            suma = suma + array[i];
        }
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }
}
