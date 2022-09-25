import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            String A = "*";
            String B = " ";
            A = A.repeat(i);
            B = B.repeat(T-i);
            System.out.printf(B);
            System.out.printf(A);
            System.out.printf("%n");
        }
    }
}
