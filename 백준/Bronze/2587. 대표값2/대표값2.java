import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
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

        int sum = 0;
        int min = 0;
        for (int j : arr) {
            sum += j;
        }
        
        System.out.println(sum/5);
        System.out.println(arr[2]);
    }
}