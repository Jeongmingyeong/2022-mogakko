package mogakko_01;
import java.util.*;

public class bridgenum_1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // case number
		sc.nextLine();
		double N = 0;
		double K = 0;
		
		for(int i = 0; i < n; i++) {
			N = sc.nextDouble(); //왼쪽 사이트 개수
			K = sc.nextDouble(); //오른쪽 사이트 개수
			
			System.out.println(Math.round(Combination(N, K)));
		}
		
		sc.close();
	}
	public static double Combination(double N, double K) {
		double up = 1; // 분자
		double bottom = 1; // 분모
		
		for(double i = N; i > 0; i--) {
			bottom *= i;
		}
		for(double i = K; i > K-N; i--) {
			up *= i;
		}
		return up / bottom;
	}
}
