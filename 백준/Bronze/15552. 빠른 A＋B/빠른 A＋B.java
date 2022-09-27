import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(bf.readLine());

        for(int i=0; i<A; i++) {
            String num = bf.readLine(); // 입력데이터가 String으로 반환되기 때문에 스트링으로 지정
            int B = Integer.parseInt(num.split(" ")[0]); // 공백을 기준으로 나눈 num에서 첫번째 인자 가져오기
            int C = Integer.parseInt(num.split(" ")[1]); // 공백을 기준으로 나눈 num에서 두번째 인자 가져오기
            bw.write(B+C+" "); //bw에 int값 넣고, 공백문자 더해줌으로 스트링으로 변경
            bw.newLine(); //줄바꿈
        }
        bw.flush(); //bw 출력
    }
}
