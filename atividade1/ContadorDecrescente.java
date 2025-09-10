public class ContadorDecrescente {

    public static void contadorDecrescente(int n) {
        if (n < 0) { // Caso base: quando chegou em -1, para a recursão
            return;
        }
        System.out.println(n); // Mostra o número atual
        contadorDecrescente(n - 1); // Chamada recursiva para o próximo número (diminuindo)
    }

    public static void main(String[] args) {
        int N = 5; 
        contadorDecrescente(N);
    }
}
