import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		long min = sc.nextLong();
		long max = sc.nextLong();
		
		boolean[] check = new boolean[2000000];
		long finish = (long)Math.sqrt(max);
		
		
		for(long i = 2; i<finish+1; i++) {
			long temp = i*i;
			long start = 0;
			if(min % temp == 0 ) {
				start = min / temp;
			}else {
				start = (min / temp) + 1;
			}
			for(long j = start; j*temp<max+1; j++) {
				check[(int)((j*temp)-min)] = true;
			}
		}
		
		long count = 0;
		for(int i = 0; i<(max-min+1); i++) {
			if(check[i]==false) {
				count++;
			}
		}
		System.out.print(count);
		
		
		
	}
}
