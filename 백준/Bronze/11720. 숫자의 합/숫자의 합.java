import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();
        int sum = 0;
        for (int i=0; i<A; i++) {
            int N = (B.charAt(i))-'0';
            sum = sum + N;
        }
        System.out.println(sum);
    }
}
