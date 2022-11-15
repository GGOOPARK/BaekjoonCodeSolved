import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int cutline = sc.nextInt();
        int[] arr = new int[A];
        for (int i = 0; i < A; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) { //성적순으로 배열
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int B = arr[j];
                    arr[j] = arr[i];
                    arr[i] = B;
                }
            }
        }
        System.out.println(arr[cutline-1]);
    }
}