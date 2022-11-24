import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String[] arr = new String[A];
        sc.nextLine();	// 개행 버림

        for (int i = 0; i < A; i++) {
            arr[i] = sc.nextLine();
        }
        
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) { //단어 길이가 같을 경우 사전순대로
                    return s1.compareTo(s2);
                }
                else {
                    return s1.length() - s2.length(); // 아니면 단어길이대로 정렬
                }
            }
        });
        
        System.out.println(arr[0]);
        for (int i = 1; i < A; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                System.out.println(arr[i]);
            }
        }
    }
}