import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ho = sc.nextInt();
        int Mi = sc.nextInt();
        int X = sc.nextInt();

        Ho = Ho + (X / 60);
        Mi = Mi + (X % 60);

        if (Mi>=60) {
            Ho = Ho + 1;
            Mi = Mi - 60;}
        if (Ho>=24) Ho = Ho -24;
        System.out.println(Ho + " " + Mi);
        }
    }
