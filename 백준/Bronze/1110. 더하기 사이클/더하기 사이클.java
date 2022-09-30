import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine(); //값을 받기
        int A = Integer.parseInt(first); // 처음 값
        int Aa = A; // 반복문 후 비교할 A의 처음 값 저장
        int count = 0; //반복문 실행횟수
        while (true) {
            int ten = (A/10); // A의 십의 자리 수
            int one = (A%10); // A의 일의 자리 수
            A = (one*10) + ((ten + one)%10);
            count ++; // count 증가
            if (A==Aa) break; // 초기값이랑 일치하면 반복문 중단
        }
        System.out.println(count);
        }
    }
