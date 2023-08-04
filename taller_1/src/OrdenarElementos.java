public class OrdenarElementos {
    public static void bubbleSort(int[] array) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < array.length - 1; i++) {
                if ((array[i] > array[i + 1])) {
                    int temp = array[i];
                    array[i] = array[i + 1];
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
