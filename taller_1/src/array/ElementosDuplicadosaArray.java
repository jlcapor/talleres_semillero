package array;

import java.util.Arrays;
import java.util.HashSet;

public class ElementosDuplicadosaArray {

    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 3, 4, 3, 5, 6, 1, 2, 7, 8, 9, 10, 5 };

        System.out.println("Arreglo original: " + Arrays.toString(arreglo));

        int[] sinDuplicados = eliminarDuplicados(arreglo);

        System.out.println("Arreglo sin duplicados: " + Arrays.toString(sinDuplicados));
    }

    public static int[] eliminarDuplicados(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        int[] sinDuplicados = new int[set.size()];
        int index = 0;
        for (int num : set) {
            sinDuplicados[index++] = num;
        }

        return sinDuplicados;
    }
}
