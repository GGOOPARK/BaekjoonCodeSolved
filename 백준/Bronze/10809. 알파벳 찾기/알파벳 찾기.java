import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
        String A = br.readLine();
        for (int i=0; i<A.length(); i++) {
            int B = A.charAt(i) - 'a';
            if (arr[B] == -1) {
                arr[B] = i;
            }
        }
        for (int k=0; k<26; k++){
            if (k<=24) System.out.print(arr[k]+" ");
            if (k==25) System.out.print(arr[k]);
        }
    }
}
