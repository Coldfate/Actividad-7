import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int inicializar;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        inicializar = sc.nextInt();
        System.out.println("Números primos:");
        primeNumbers(inicializar);
        System.out.println("\n");
        System.out.println("Serie de fibonacci:");
        fibonacci(inicializar);
        show(inicializar);
    }
    public static void primeNumbers(int iNumber){
        int iCounter = 2;
        int [] primeArray;
        boolean iPrime;

        for (int i = 2 ; i <= iNumber ; i++){
            iPrime = true;
            for (int j = 2 ; j < i ; j++){
                if (i % j == 0 ){
                    iPrime = false;
                }
            }
                if (iPrime){
                    System.out.print(i+ " ");
                }
        };

    }
    public static int fibonacci(int n)
    {
        if (n>1){
            return fibonacci(n-1) + fibonacci(n-2);
        }
        else if (n==1) {
            return 1;
        }
        else if (n==0){
            return 0;
        }
        else{
            return -1;
        }
    }
    public static void show (int n){
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i)+" ");
        }
        System.out.println();
    }
}
