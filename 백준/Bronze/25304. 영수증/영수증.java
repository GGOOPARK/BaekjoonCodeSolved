import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Sum = sc.nextInt();
        int line = sc.nextInt();
        int el = 0;
        for(int i = 1; i<=line; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            el = el+A*B;
        }
        if (Sum == el) System.out.println("Yes");
        else System.out.println("No");
    }
}