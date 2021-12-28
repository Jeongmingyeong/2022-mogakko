package mogakko_01;
import java.util.*;

public class company_7785 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String name = "";
		String where = "";
		HashSet<String> people = new HashSet<>();
		
		for(int i = 0; i < n; i++) {
			String[] str = sc.nextLine().split(" ");
			name = str[0];
			where = str[1];
			if(where.equals("enter")) {
				people.add(name);
			}
			if(where.equals("leave")) {
				if(people.contains(name)) {
					people.remove(name);
				}
			}
		}
		
		List<String> list = new ArrayList<>();
		Iterator<String> iter = people.iterator();
		while(iter.hasNext()) {
			list.add(iter.next());
		}

		Collections.sort(list, Collections.reverseOrder());
		
		for(String peoplename : list) {
			System.out.println(peoplename);
		}
		sc.close();
	}
}
