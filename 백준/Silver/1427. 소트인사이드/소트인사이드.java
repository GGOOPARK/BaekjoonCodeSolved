import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] arr = sc.nextLine().toCharArray(); 

        Arrays.sort(arr); //오름차순으로 정리

        for (int i = arr.length - 1; i >= 0; i--) { //뒤에서부터 출력
            System.out.print(arr[i]);
        }

    }
}