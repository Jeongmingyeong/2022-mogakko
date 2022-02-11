import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		 String[][] arr = new String[8][];
		 for(int i=0; i<8; i++) {
			 arr[i] = sc.nextLine().split("");
		 }
		 
		
		 int count = 0;
		 // 하얀 칸 위에 있는 말의 개수를 구하기
		 // 0,0 좌표는 흰 칸이다. 
		 
		 for(int i=0; i<8; i++) {
			 for(int j=0; j<8; j++) {
				 if(arr[i][j].equals("F")&&(i+j)%2==0) {
					 count++;
				 }
			 }
		 }
		 
		 System.out.println(count);
		
		
	}
}
