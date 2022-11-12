import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        for (int i = 0; i<A; i++) {
            int num = sc.nextInt();
            int a1 = num/2;
            int a2 = num/2;
            
            while (true) {
                if(isPrime(a1) && isPrime(a2)) break;
                else a1--; a2++;
            }
            System.out.println(a1 + " " + a2);
        }
    }
    
    static boolean isPrime(int n) {
        boolean T = true;
        for (int i = 2; i*i <= n; i++ ){
            if (n % i == 0) {
                T = false;
                break;
            } 
        }
        return T;
    }
}