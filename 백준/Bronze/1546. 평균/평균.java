import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 첫째줄 N 받기

        double arr[] = new double[N]; // N길이만큼의 double형 배열 선언

        StringTokenizer st = new StringTokenizer(br.readLine()," "); //공백을 기준으로 점수 분리

        for (int i =0; i<arr.length; i++) { // 값을 받으면서 배열에 넣어주기
            arr[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(arr); // 배열을 오름차순으로 정렬
        double avg = 0; //새로운 평균값
        for (int j =0; j<arr.length; j++) {//나머지 점수를 최댓값 arr[0]으로 나눠서 더하기\
            avg = avg + ((arr[j] / arr[arr.length-1])*100); // avg에 다른 점수를 최솟값으로 나누고 *100하여 더해주기
        }
        System.out.println(avg/arr.length); // 평균을 출력하기
    }
}