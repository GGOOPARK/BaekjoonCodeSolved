import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for(int i=0; i<count; i++) {
            String[] str = br.readLine().split(" ");

            int A = Integer.parseInt(str[0]);
            String B = str[1];

            for(int j=0; j<B.length(); j++){
                for(int k=0; k<A; k++) {
                    System.out.print(B.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
