import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // 출력해야할 %의 갯수
        int [] arr;
        for (int i=0; i<count; i++) {
            int A = sc.nextInt(); // i번째 줄에 주어진 점수 갯수
            arr = new int[A]; // A크기의 배열 선언
            int sum = 0; // 합계
            for (int j=0; j<A; j++){
                int B = sc.nextInt();
                arr[j] = B;
                sum = sum+B;
            }
            double avg = (sum/A);
            double avgover = 0;

            for (int j=0; j<A; j++) {
                if (arr[j]>avg) avgover++;
            }
            System.out.printf("%.3f%%\n",(avgover/A)*100);
        }
    }
}

