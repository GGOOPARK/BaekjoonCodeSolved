import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int A = sc.nextInt();
            if (A == 0) break;
            int isPrimeCount = 0;

            for (int i = A+1; i <= A * 2; i++) { // 두 수 사이에 소수가 있는 지 검사
                boolean isPrime = true; // 소수검사 불린
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) { //2이상의 약수가 있을 시 소수가 아님
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) isPrimeCount++;
            }
            System.out.println(isPrimeCount);
        }
    }
}