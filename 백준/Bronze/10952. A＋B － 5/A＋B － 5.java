import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i=0; i<1; i=i) {
            String num = bf.readLine();
            int B = Integer.parseInt(num.split(" ")[0]);
            int C = Integer.parseInt(num.split(" ")[1]);
            if (B+C==0) break;
            bw.write(B+C+"");
            bw.newLine();
        }
        bw.flush();
    }
}
