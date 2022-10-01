import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] arr = new int[A];
        for (int i=0; i<A;i++) {
            int B = sc.nextInt();
            arr[i] = B;
        }
        Arrays.sort(arr);
        System.out.print(arr[0]+" ");
        System.out.print(arr[arr.length-1]);
    }
}
