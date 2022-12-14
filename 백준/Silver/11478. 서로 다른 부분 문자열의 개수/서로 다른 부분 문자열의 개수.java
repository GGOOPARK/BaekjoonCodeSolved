import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String s= sc.next();
		
		HashSet<String> pack = new HashSet<>();
		
		for(int i=0; i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				if(!pack.contains(s.substring(i, j))){
					pack.add(s.substring(i,j));
				}
			}
		}
		System.out.println(pack.size());
	}
}