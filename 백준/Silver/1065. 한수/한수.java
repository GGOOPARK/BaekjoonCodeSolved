import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(isNum(sc.nextInt())); // 함수 정의
        }

        public static int isNum(int num) {
        int count; // 한수 갯수

        if (num<100) {
            return num;
        }

        else {
            count = 99; //100이하의 숫자 99개 확보

            for (int i = 100; i<= num; i++) { //등차수열 이루는 지 확인하기 위해 자릿수 구하기
                int A = i / 100;
                int B = (i - (A*100)) / 10;
                int C = i % 10;

                if ((A-B) == (B-C)) {
                    count++;
                }
            }
        }
        return count;
    }
}