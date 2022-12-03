import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        for(int i =  0 ; i < 3 ; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }

        if(arr1[0] == arr1[1]){
            System.out.print(arr1[2] + " ");
        }else if(arr1[0] == arr1[2]){
            System.out.print(arr1[1] + " ");
        }else{
            System.out.print(arr1[0] + " ");
        }

        if(arr2[0] == arr2[1]){
            System.out.print(arr2[2]);
        }else if(arr2[0] == arr2[2]){
            System.out.print(arr2[1]);
        }else{
            System.out.print(arr2[0]);
        }
    }
}