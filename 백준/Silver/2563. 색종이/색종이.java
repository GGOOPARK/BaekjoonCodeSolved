import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int papers = sc.nextInt();
        int [][] paper = new int[100][100];
        for (int i=0; i<papers; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            for (int j = X; j < X+10; j++) {
                for (int q = Y; q < Y+10; q++) {
                    paper[j][q]=1;
                }
            }
        }
        int sum=0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(paper[i][j]==1) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}