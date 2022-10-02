import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> result = new HashSet<Integer>();
        for (int i = 0; i <= 9; i++) { 
            int N = (sc.nextInt())%42;
            result.add(N);
        }
        System.out.println(result.size());
    }
}

