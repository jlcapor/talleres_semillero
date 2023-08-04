public class SerieFibonacci {

    public static void main(String[] args) throws Exception {
        int n = 20;
        long siguiente = 1, actual = 0, temporal = 0;
        System.out.println("Serie de Fibonacci");
        for (int i = 1; i <= n; ++i) {
            System.out.print(actual + ", ");
            temporal = actual;
            actual = siguiente;
            siguiente = siguiente + temporal;
        }
    }
}
