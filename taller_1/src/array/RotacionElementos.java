package array;
public class RotacionElementos {
    public static void main(String[] args) throws Exception {
        int[] arreglo = { 1, 2, 3, 4, 5 };
        int posiciones = 2; 
        String direccion = "derecha"; 

        System.out.println("Arreglo original: ");
        imprimirArreglo(arreglo);

        if (direccion.equalsIgnoreCase("izquierda")) {
            rotarIzquierda(arreglo, posiciones);
        } else if (direccion.equalsIgnoreCase("derecha")) {
            rotarDerecha(arreglo, posiciones);
        } else {
            System.out.println("Dirección inválida. Debe ser 'izquierda' o 'derecha'.");
            return;
        }

        System.out.println("Arreglo rotado " + posiciones + " posiciones hacia la " + direccion + ": ");
        imprimirArreglo(arreglo);
    }

    public static void rotarIzquierda(int[] arr, int k) {
        int n = arr.length;
        
        // { 1, 2, 3, 4, 5 }
        //      2
        
        for (int i = 0; i < k; i++) {
            int temp = arr[0]; // 1
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1]; // 2
            }
            arr[n - 1] = temp;
        }
    }

    public static void rotarDerecha(int[] arr, int k) {
        int n = arr.length;
       
        System.out.print(k + "rotarDerecha");
        for (int i = 0; i < k; i++) {
            int temp = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }

    public static void imprimirArreglo(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
