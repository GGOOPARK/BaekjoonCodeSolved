import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 입력받은 수

        for (int i=2; i*i<=A; i++) { // 2부터 약수를 가지는 지 확인
            while (A % i == 0) {
                System.out.println(i); // A의 약수 출력
                A = A/i; // A를 나눈 뒤 값
            }
        }
        if (A != 1) { //A를 다 나눈 뒤에 A가 1이 아니면 나눈 뒤의 A는 약수이자 소수 이므로 A 추가출력
            System.out.println(A);
        }
    }
}
