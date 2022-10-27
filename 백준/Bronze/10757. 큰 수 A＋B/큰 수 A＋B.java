import java.util.Scanner;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		BigInteger A = new BigInteger(in.next()); // 무한정수를 담을 수 있는 BigInteger 만들기
		BigInteger B = new BigInteger(in.next());
		
		A = A.add(B); // 자체함수 add로 +연산
		
		System.out.println(A.toString()); // 문자열로 변환해주기
	}
}