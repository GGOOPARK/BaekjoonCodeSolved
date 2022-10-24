import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt(); // 테스트 케이스 수

        for (int i = 0; i < testCase; i++) {
            int floorNum = sc.nextInt(); // 층수
            int roomNum = sc.nextInt(); // 층의 방 개수
            int guestNum = sc.nextInt(); // 손님의 출입번호

            if (guestNum % floorNum == 0) { // 배정될 방의 층 수 구하기 (나누어 떨어질 때, 손님의 방은 floorNum층이 됨
                System.out.println((floorNum * 100) + (guestNum / floorNum)); // 호수는 guestNum을 나눈 몫이 정함(4층 건물 4번째 손님일 때, 401호에 배정됨)
            }

            else { // (나누어 떨어지지 않을 때, 손님의 방은 나머지 값(4층 건물 5번째 손님은 1층에 배정됨)
                System.out.println((guestNum % floorNum * 100) + (guestNum / floorNum) + 1); // 호수는 guestNum을 나눈 몫에 +1 4층 건물 5번째 손님은 102호 배정)
                // 규칙성을 찾아 코드로 만들었다.
            }
        }
    }
}
