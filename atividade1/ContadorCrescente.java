public class ContadorCrescente {

    public static void contadorCrescente(int n, int i) {
        if (i > n) { 
            return;
        }
        System.out.println(i); // Mostra o número atual
        contadorCrescente(n, i + 1); // Chamada recursiva para o próximo número
    }

    public static void main(String[] args) {
        int N = 5; 
        contadorCrescente(N, 1);
    }
}
