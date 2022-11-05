import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 검사할 소수 개수
        int count = 0; // 출력할 소수 개수

        for (int i=0; i<A; i++) {
            int num = sc.nextInt(); // 수 받고
            boolean isPrime = true;
            if (num==1) continue; // 1인 경우 반복문 스킵
            for(int j=2; j*j<=num; j++ ) { // 2이상의 j부터 제곱근까지 약수가 있는지 검사
                if (num%j == 0) { //약수가 있다면 isPrime false 후 break
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++; // isPrime true일 때 count 증가
        }
        System.out.print(count);
    }
}
