import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 최초고정비용
        int B = sc.nextInt(); // 개당생산비용
        int C = sc.nextInt(); // 개당 가격

        if (C <= B) System.out.print("-1"); // 개당 생산비용이 개당 가격보다 이하일경우 무한대를 팔아도 수익실현 불가능;

        else System.out.print(A/(C-B)+1); // 개당 가격 - 개당생산비용 = 개당수익

    }
}