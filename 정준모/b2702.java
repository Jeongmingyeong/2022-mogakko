import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception {
 
		Scanner sc = new Scanner(System.in);
		int cycle = sc.nextInt();
		for (int i = 0; i < cycle; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.print(a * b / gcd2(a, b));
			System.out.println(" " + gcd2(a, b));
		}
 
	}
 
	static int gcd(int a, int b) {
		// a>b
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
 
	static int gcd2(int a, int b) {
		int r = a % b;
		if (r == 0) {
			return b;
		} else {
			return gcd2(b, r);
		}
	}
}
