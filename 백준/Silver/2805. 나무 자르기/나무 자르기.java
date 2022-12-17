import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		int[] arr = new int[N];
		
		int min = 0;
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
			
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		while(min < max) {
			
			int mid = (min + max) / 2;
			long sum = 0;
			for(int treeHeight : arr) {
					if(treeHeight - mid > 0) { 
					sum += (treeHeight - mid);
				}
			}
			 
			if(sum < M) {
				max = mid;
			}
			
			else {
				min = mid + 1;
			}
		}
		
		System.out.println(min - 1);
		
	}
}