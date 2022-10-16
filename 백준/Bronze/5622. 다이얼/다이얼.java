import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int time = 0;

        for (int i=0; i<A.length(); i++) {
            if (A.charAt(i) == 'A' || A.charAt(i) == 'B' || A.charAt(i) == 'C') time += 3;
            if (A.charAt(i) == 'D' || A.charAt(i) == 'E' || A.charAt(i) == 'F') time += 4;
            if (A.charAt(i) == 'G' || A.charAt(i) == 'H' || A.charAt(i) == 'I') time += 5;
            if (A.charAt(i) == 'J' || A.charAt(i) == 'K' || A.charAt(i) == 'L') time += 6;
            if (A.charAt(i) == 'M' || A.charAt(i) == 'N' || A.charAt(i) == 'O') time += 7;
            if (A.charAt(i) == 'P' || A.charAt(i) == 'Q' || A.charAt(i) == 'R' || A.charAt(i) == 'S') time += 8;
            if (A.charAt(i) == 'T' || A.charAt(i) == 'U' || A.charAt(i) == 'V') time +=9;
            if (A.charAt(i) == 'W' || A.charAt(i) == 'X' || A.charAt(i) == 'Y' || A.charAt(i) == 'Z') time += 10;
        }
        System.out.print(time);
    }
}

