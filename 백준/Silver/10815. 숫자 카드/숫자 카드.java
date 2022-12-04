import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int A = Integer.parseInt(br.readLine());
        int[] cards = new int[A];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);
        int B = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            int temp = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(cards, A, temp)).append(" ");
        }

        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int binarySearch(int[] cards, int A, int search) {
        int first = 0;
        int last = A - 1;
        int mid = 0;

        while (first <= last) {
            mid = (first + last) / 2;

            if (cards[mid] == search) {
                return 1;
            }

            if (cards[mid] < search) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return 0;
    }

}
