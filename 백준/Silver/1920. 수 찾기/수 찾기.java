import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int[] arr = new int[A];
        
        for (int i = 0; i < A; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr); // 이분 탐색을 위해 정렬해줌

        int B = sc.nextInt();

        for (int i = 0; i < B; i++) {
            int count = 0;
            int low = 0;
            int high = A - 1;
            int x = sc.nextInt();
            
            while (low <= high) {
                int mid = (low + high) / 2; 
                if (arr[mid] == x) {
                    count = 1;
                    break;
                }
                if (arr[mid] > x) high = mid - 1;
                else low = mid + 1;
            }
            System.out.println(count);
        }
    }
}