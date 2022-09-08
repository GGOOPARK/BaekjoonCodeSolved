import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        int A,B;
        A = sc1.nextInt();
        B = sc1.nextInt();
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
    }
}