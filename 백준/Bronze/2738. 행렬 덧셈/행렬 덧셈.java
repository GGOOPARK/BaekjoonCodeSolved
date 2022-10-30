import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int [][] arr = new int[A][B]; // 이차행렬 선언

        for (int i=0; i<2; i++) { // 이차행렬에 값 행렬A의 원소를 넣고 다음 행렬 B의 원소를 더해주는 반복문
            for (int j=0; j<A; j++) {
                for (int k=0; k<B; k++) {
                    arr [j][k] += sc.nextInt();
                }
            }
        }

        for (int i=0; i<A; i++) { //더해진 이차행렬의 원소 출력하기
            for (int j=0; j<B; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
} 