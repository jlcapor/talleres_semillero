package matriz;

public class TablaMultiplicar {
    static int[][] crearMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * j;
            }
        }
        return matriz;
    }

    static void muestraMatriz(int[][] matriz) {
        int i, j;

        for (i = 1; i <= matriz.length - 1; i++) {
            System.out.println("Tabla de multiplicar del " + i);
            for (j = 1; j <= matriz[i].length - 1; j++) {
                System.out.println(i + " x " + j + " = " + matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        int[][] matriz = new int[12][12];

        matriz = crearMatriz(11, 11);
        muestraMatriz(matriz);
    }
}
