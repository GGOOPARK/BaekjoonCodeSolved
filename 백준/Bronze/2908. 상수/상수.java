import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        String A = "";
        String B = "";

        for(int i=str[0].length()-1; i>=0; i--){
            A += str[0].charAt(i);
        }
        for(int i=str[1].length()-1; i>=0; i--){
            B += str[1].charAt(i);
        }
        int C = Integer.parseInt(A);
        int D = Integer.parseInt(B);
        System.out.print(Math.max(C, D));
    }
}


