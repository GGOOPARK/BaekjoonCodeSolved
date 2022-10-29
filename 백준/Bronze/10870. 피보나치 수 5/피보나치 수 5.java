import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        System.out.print(fibonacci(A));
    }
    public static int fibonacci(int A) {
        if (A==0) return 0;
        if (A==1) return 1;
        return fibonacci(A-2) + fibonacci(A-1);
    }
}