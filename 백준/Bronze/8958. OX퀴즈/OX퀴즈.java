import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            String A = sc.next();
            int B = 0; //연속된 O의 수
            int C = 0; // 점수합
            for (int j=0; j<A.length(); j++){
                if(A.charAt(j)=='O') {
                    B++;
                    C = C + B;
                }
                if(A.charAt(j)=='X') {
                    B = 0;
                }
            }System.out.println(C);
        }
    }
}

