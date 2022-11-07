import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 입력받은 두 수
        int B = sc.nextInt();

        for (int i=A; i<=B; i++) { // 두 수 사이에 소수가 있는 지 검사
            if (i == 1) continue; //1은 소수가 아니므로 통과
            boolean isPrime = true; // 소수검사 반복문
            for (int j=2; j*j<=i; j++) {
                if (i%j==0) { //2이상의 약수가 있을 시 소수가 아님
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(i);
        }
    }
}
