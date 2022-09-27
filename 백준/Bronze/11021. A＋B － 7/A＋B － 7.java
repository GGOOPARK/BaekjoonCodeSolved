import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(bf.readLine());

        for(int i=1; i<=A; i++) {
            String num = bf.readLine();
            int B = Integer.parseInt(num.split(" ")[0]);
            int C = Integer.parseInt(num.split(" ")[1]);
            bw.write("Case #"+i+": " +(B+C));
            bw.newLine(); //줄바꿈
        }
        bw.flush(); //bw 출력
    }
}
