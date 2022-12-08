import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]); // 듣지 못한 사람들 명단
        int m = Integer.parseInt(inputs[1]); // 보지 못한 사람들 명단

        HashSet<String> set = new HashSet<>(); 
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>(); // 출력할 듣도보도 못한 명단
        for (int i = 0; i < m; i++) {
            String A = br.readLine();
            if(set.contains(A)){
                result.add(A);
            }
        }

        Collections.sort(result);

        System.out.println(result.size()); // 듣도보도 못한 명단의 인원 수
        for (String s : result) { // 듣도보도 명단 이름
            System.out.println(s); 
        }
    }
}