import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)throws IOException {
        int[] cnt = new int[10001]; // 범위 내 숫자 포함하는 배열 생성

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine()); // 숫자갯수

        for (int i = 0; i < A; i++) { // 숫자에 해당하는 배열 수 증가
            cnt[Integer.parseInt(br.readLine())] ++;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < 10001; i++){ // 배열 순회하며 출력
            if (cnt[i]==0) continue;
            while(cnt[i] > 0){
                sb.append(i).append('\n'); // 숫자만큼 스트링빌더에 줄바꿈과 함께 입력
                //스트링빌더 대신에 반복1회마다 출력하는 방법 써봤지만 시간초과됨..
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}