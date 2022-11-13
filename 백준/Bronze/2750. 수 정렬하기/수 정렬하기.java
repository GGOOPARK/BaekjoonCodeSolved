import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] arr = new int[A];

        for (int i = 0; i < A; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) { // arr[0]과 arr[1], arr[1]과 arr[2] 차례대로 비교
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int B = arr[j]; // 큰 값 임시저장
                    arr[j] = arr[i]; // 배열값 이동
                    arr[i] = B;
                }
            }
        }
        for (int j : arr) {
            System.out.println(j); // 출력
        }
    }
}