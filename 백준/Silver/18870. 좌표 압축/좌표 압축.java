import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
 
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		int[] origin = new int[A];
		int[] sorted = new int[A];
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();	
 
		
		for(int i = 0; i < A; i++) {
			sorted[i] = origin[i] = sc.nextInt();
		}
        
		Arrays.sort(sorted);
        
		int rank = 0;
        
		for(int x : sorted) {
			if(!rankingMap.containsKey(x)) {
				rankingMap.put(x, rank);
				rank++;		
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : origin) {
			int ranking = rankingMap.get(key);	
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);
	}
}