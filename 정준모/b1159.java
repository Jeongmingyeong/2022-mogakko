import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
 
		int cycle = sc.nextInt();
		String[] arr = new String[cycle];
 
		for (int i = 0; i < cycle; i++) {
			arr[i] = sc.next();
		}
 
		int[] name = new int[30];
 
		for (int i = 0; i < cycle; i++) {
			name[arr[i].charAt(0) - 'a']++;
		}
 
		for (int i = 0; i < 30; i++) {
			if (name[i] >= 5) {
				sb.append((char) (i + 'a'));
			}
		}
		String str = sb.toString();
		if (str.isEmpty()) {
			System.out.print("PREDAJA");
		} else {
			System.out.print(sb);
		}
 
	}
}
