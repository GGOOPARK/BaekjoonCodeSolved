import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A = 0;
        for(int i = 1; i<=n; i++){
            A = A+i;}
        System.out.println(A);
    }
}