import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N]; // 배열 선언
        int count = 0;

        for (int i = 0; i < N; i++) { //숫자 받아 배열에 넣는 반복문
            arr[i] = sc.nextInt();
        }

        int X = sc.nextInt();

        for (int i = 0; i < N; i++) { //배열 순회하며 같은 값 검사
            if (X == arr[i]) count++;
        }

        System.out.print(count);
    }
}

