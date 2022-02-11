import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
		int M = sc.nextInt();
 
		// N은 학급 수 M 은 신청 가능한 인원 수
		// 첫줄부터 학급 오름차순으로 출력함.
		// 같은학급 이면 이름길이 짧은거부터!
 
		ArrayList<Integer> numlist = new ArrayList<>();
		ArrayList<String> namelist = new ArrayList<>();
		int[] chk = new int[11];
		while (true) {
			int num = sc.nextInt();
			String name = sc.next();
			if (num == 0) {
				break;
			}
			chk[num]++;
			if (chk[num] > M) {
				continue;
			}
			numlist.add(num);
			namelist.add(name);
		}
 
		for (int i = 0; i < numlist.size(); i++) {
			for (int j = 0; j < numlist.size() - 1; j++) {
				
				if (numlist.get(j) > numlist.get(j + 1)) {
					
					int temp = numlist.get(j + 1);
					numlist.set(j + 1, numlist.get(j));
					numlist.set(j, temp);
					
					String tempname = namelist.get(j + 1);
					namelist.set(j + 1, namelist.get(j));
					namelist.set(j, tempname);
					
				
				}
			}
		}
		
		
		for (int i = 0; i < numlist.size(); i++) {
			for (int j = 0; j < numlist.size() - 1; j++) {
				
				if (numlist.get(j + 1) == numlist.get(j)) {
					if (namelist.get(j + 1).length() > namelist.get(j).length()) {
						System.out.print("");
					} else if(namelist.get(j+1).length() < namelist.get(j).length()){
						String tempname2 = namelist.get(j + 1);
						namelist.set(j + 1, namelist.get(j));
						namelist.set(j, tempname2);
					}else if(namelist.get(j+1).length() == namelist.get(j).length()) {
						if(namelist.get(j+1).charAt(0)<namelist.get(j).charAt(0)) {
							String tempname2 = namelist.get(j + 1);
							namelist.set(j + 1, namelist.get(j));
							namelist.set(j, tempname2);
						}
					}
				}
			}
		}
		
 
		for (int i = 0; i < namelist.size(); i++) {
			if (numlist.get(i) % 2 == 0) {
				continue;
			} else {
				System.out.println(numlist.get(i) + " " + namelist.get(i));
			}
		}
		for (int i = 0; i < namelist.size(); i++) {
			if (numlist.get(i) % 2 != 0) {
				continue;
			} else {
				System.out.println(numlist.get(i) + " " + namelist.get(i));
			}
		}
 
	}
}
