import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 숫자 받기
        int B = 1; // A가 위치한 레이어
        
        while (A > 1 ) {
            A = A - 6 * B;
            B++;
        }
        System.out.print(B);
    }
}


