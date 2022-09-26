import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        for (int i = 1; i<=A; i++){
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = B+C;
            System.out.println("Case #" + i + ": " + B + " + " + C + " = " + D);
        }
    }
}

