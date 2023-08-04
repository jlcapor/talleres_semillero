package array;
import java.util.Arrays;

public class ElementosDuplicadosaArray {

    public static int[] eleiminarDuplicados(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }

    public static void main(String[] args) throws Exception {
        int[] array = { 3, 4, 5, 3, 5, 7, 8, 9, 8 };
        int[] distintos = eleiminarDuplicados(array);
        System.out.println(Arrays.toString(distintos));
    }
}
