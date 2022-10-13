import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next().toUpperCase(); // scanner로 받은 단어 대문자로 변환

        int[] alphabet = new int[26]; // 알파벳 26개의 값을 저장할 배열 생성

        for (int i =0; i<A.length(); i++) { // A를 순회하며 알파벳 조사
            int num = A.charAt(i) - 65; // char A는 int 65이므로 A일 때 int[0]의 값이 증가하게 됨
            alphabet[num]++;
        }

        int max = 0; // max 값 생성
        char maxAlphabet = '?';

        for (int i=0; i<26; i++) { //배열값 순회하며 max랑 비교
            if (max<alphabet[i]) {
                max = alphabet[i]; // max값 저장
                maxAlphabet = (char)(i+65); // 만약 max=0일 때 maxAlphabet은 char(65)=A가 됨.
            } else if (max==alphabet[i]) { // max값이 2개 이상 나올 시
                maxAlphabet = '?'; // ?출력
            }
        }
        System.out.print(maxAlphabet);
    }
}