public class Contador4 {

    public static void contar(int N) {
        
        for(int i = 1; i <= N ; i++) {

            System.out.println(i);

        }

        for( int i = N ; i >= 1 ; i--) {

            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        contar(4);
    }
    
}

