import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int max = A;
        if (B>max) max = B;
        if (C>max) max = C;

        if (A==B) {
            if (B==C) System.out.println(10000 + A*1000);
            else System.out.println(1000 + A*100);}
        else {
            if (B==C) System.out.println(1000 + B*100);
            else if (A==C) System.out.println(1000 + A*100);            
            else System.out.println(max * 100);
        }
    }
}
