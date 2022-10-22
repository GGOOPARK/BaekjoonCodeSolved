import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 미터
        int B = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 미터
        int C = Integer.parseInt(st.nextToken()); // 나무 막대 길이

        int day = (C-B) / (A-B);

        if ((C-B) % (A-B) != 0) day++;

        System.out.print(day);
    }
}
