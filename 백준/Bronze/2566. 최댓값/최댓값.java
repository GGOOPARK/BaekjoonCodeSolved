import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10]; // 9*9 이중배열 생성
        int max = 0;
        int X = 0;
        int Y = 0;

        for (int i = 0; i < 9; i++) { // 배열에 숫자 넣기
            for (int j= 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    X = i + 1; // i+1이 max값의 행
                    Y = j + 1; // j+1이 max값의 열이 된다.
                }
            }
        }
        if (max == 0) {
            X=1;
            Y=1;
        }
        System.out.println(max);
        System.out.print(X+" "+Y);
    }
}