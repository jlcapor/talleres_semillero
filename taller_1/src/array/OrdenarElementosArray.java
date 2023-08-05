package array;
public class OrdenarElementosArray {
    public static void bubbleSort(int[] array) {
        boolean swap = true;
        while (swap) {
            //[2, 1, 4, 5, 3, 7]
            // i
            swap = false;
            for (int i = 0; i < array.length - 1; i++) {
                if ((array[i] > array[i + 1])) {
                    int temp = array[i]; // 2
                    array[i] = array[i + 1]; // 1
                    array[i + 1] = temp;
                    swap = true;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int[] array = { 2, 1, 4, 5, 3, 7 };
        bubbleSort(array);
        for (int i : array) {
            System.out.println("Ordenado: " + i);
        }
        
    }
}
