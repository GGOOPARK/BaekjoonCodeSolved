import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++)
            arr[i] = sc1.nextInt();
        System.out.print(1-arr[0]+" ");
        System.out.print(1-arr[1]+" ");
        System.out.print(2-arr[2]+" ");
        System.out.print(2-arr[3]+" ");
        System.out.print(2-arr[4]+" ");
        System.out.print(8-arr[5]);
        }
    }