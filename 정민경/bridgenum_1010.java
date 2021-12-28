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
			N = sc.nextDouble(); //���� ����Ʈ ����
			K = sc.nextDouble(); //������ ����Ʈ ����
			
			System.out.println(Math.round(Combination(N, K)));
		}
		
		sc.close();
	}
	public static double Combination(double N, double K) {
		double up = 1; // ����
		double bottom = 1; // �и�
		
		for(double i = N; i > 0; i--) {
			bottom *= i;
		}
		for(double i = K; i > K-N; i--) {
			up *= i;
		}
		return up / bottom;
	}
}
