public class ContadorSubidaDescida {

    public static void contadorVaiVolta(int i, int n) {
        // Mostra o número atual
        System.out.print(i + " ");

        if (i == n) {
            return;
        }

        contadorVaiVolta(i + 1, n);

        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        int N = 4;
        contadorVaiVolta(1, N);
    }
}
