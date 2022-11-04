import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 수를 받고
        int B = 0; // A가 위치한 대각선 위치
        int C = 0; // A가 위치한 대각선까지 있는 분수 개수의 합

        while (true) {
            B++;
            C += B;
            if (C>=A) {
                if (B % 2 == 1) System.out.print((C-A+1) + "/" + (A-C+B));
                else System.out.print((A-C+B) + "/" + (C-A+1));
                break;
            }
        }
    }
}
