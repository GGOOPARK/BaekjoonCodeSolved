import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt(); // 테스트 케이스 수

        int[][] APT = new int[15][15]; //아파트 모양 2차원 배열 생성

        for (int i = 0; i < 15; i++) {
            APT[i][1] = 1; // 각 층의 1호는 무조건 1명
            APT[0][i] = i; // 0층은 모두 i명
        } //아파트 배열의 값을 모두 채울 반복문 만들기

        for (int i = 1; i < 15; i++) { // 층을 돌면서
            for (int j = 2; j < 15; j++) { // 각 층의 2호~14호를 채우기
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j]; // 각 호수는 호수의 아래층의 같은 호수와 바로 전 호수의 합을 값으로 가짐
            }
        }

        for (int i = 0; i < testCase; i++) {
            int floor = sc.nextInt();
            int ho = sc.nextInt();
            System.out.println(APT[floor][ho]);
        }
    }
}
