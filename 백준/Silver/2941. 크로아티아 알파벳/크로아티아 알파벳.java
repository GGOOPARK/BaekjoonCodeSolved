import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next(); // 입력 받기
        int count = 0; // 알파벳 갯수를 저장할 인트

        for (int i = 0; i < A.length(); i++) { //단어 순회
            char B = A.charAt(i); // 각 자리별 문자 끌어오기
            if (B == 'c' & i < A.length() - 1) { // charAt가 c이면서 뒤에 문자가 더 있을때
                if (A.charAt(i + 1) == '=') i++; // 비교해서 i++해줌!
                else if (A.charAt(i + 1) == '-') i++;
            }
            if (B == 'd' & i < A.length() - 1) { // charAt가 d이면서 뒤에 문자가 더 있을때
                if (A.charAt(i + 1) == 'z' & i<A.length()-2) { // 비교해서 i++해줌
                    if (A.charAt(i + 2) == '=') i += 2;
                } else if (A.charAt(i + 1) == '-') i++;
            }
            if (B == 'l' & i < A.length() - 1) {
                if (A.charAt(i + 1) == 'j') i++;
            }
            if (B == 'n' & i < A.length() - 1) {
                if (A.charAt(i + 1) == 'j') i++;
            }
            if (B == 's' & i < A.length() - 1) {
                if (A.charAt(i + 1) == '=') i++;
            }
            if (B == 'z' & i < A.length() - 1) {
                if (A.charAt(i + 1) == '=') i++;
            }
            count++;
        }
        System.out.print(count);
    }
}