import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ho;
        int Mi;
        int X = sc.nextInt();
        int Y = sc.nextInt();

        Mi = Y - 45;
        if (Mi < 0) {
            Mi = 60 + Mi;
            Ho = X - 1;
            if (Ho<0) { Ho=24-1;
            System.out.println(Ho + " " + Mi);}
            else System.out.println(Ho + " " + Mi);
            
        } else {
            Ho = X;
            System.out.println(Ho + " " + Mi);
        }
    }
}

