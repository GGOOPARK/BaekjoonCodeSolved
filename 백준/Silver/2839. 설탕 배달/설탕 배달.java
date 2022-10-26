import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sugarKG = sc.nextInt(); // 설탕 무게
        int leftsugar = sugarKG % 5;
        
        if (sugarKG == 4 || sugarKG == 7) System.out.println(-1);
        else if (leftsugar == 0) System.out.println(sugarKG/5);
        else if (leftsugar == 1 || leftsugar == 3) System.out.println(sugarKG / 5 + 1);
        else if (leftsugar == 2 || leftsugar == 4) System.out.println(sugarKG / 5 + 2);
    }
}
