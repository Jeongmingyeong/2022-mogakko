package mogakko_02;
import java.util.*;

public class Sumnum_1789 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		sc.close();
		int count = 0;
		long sum = 0;
		
		for(int i = 1; i < N; i++) {
			if(sum >= N) {
				break;
			}
			sum += i;
			count++;
		}
		
		System.out.println(sum > N ? count-1 : count);

	}
}
