import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int count = 0;
        for (int i = 1; i <= 9; i++) {
            int A = sc.nextInt();
            if (A > max) {
                max = A;
                count = i;
            }
        } System.out.println(max);
        System.out.println(count);
    }
}