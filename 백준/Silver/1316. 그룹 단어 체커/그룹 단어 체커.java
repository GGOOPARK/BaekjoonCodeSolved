import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = num; // 그룹단어 수

        for (int i = 0; i < num; i++) { //num 수만큼 반복문 반복
            String A = sc.next(); //단어 받기
            int[] arr = new int[26]; // 알파벳 사용여부 검사할 배열
            for (int j = 0; j < A.length(); j++) { //단어가 그룹단어인지 검사
                if (arr[(A.charAt(j) - 97)] == 0) { // 전부 소문자이므로 A.charAt(j)=a 일때 아스키코드 -97를 해주면 arr[0]에 매칭가능
                    arr[(A.charAt(j) - 97)] = 1; // 사용된 소문자인지 확인하기 위해 arr[j]값을 1로 변경
                }
                else if (j>0 & arr[(A.charAt(j) - 97)] != 0) {// 사용된 소문자일 때,
                    if (A.charAt(j) != A.charAt(j-1)) {  // 사용된 소문자가 연속된 문자가 아니라면 그룹단어가 아님
                        count --;
                        break;
                    }
                }
            }
        }
        System.out.print(count);
    }
}

