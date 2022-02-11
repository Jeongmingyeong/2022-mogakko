import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashMap<String, Integer> pokemon1 = new HashMap<>();
		HashMap<Integer, String> pokemon2 = new HashMap<>();
	

		for(int i=0; i<N; i++){
			String pokename = br.readLine();
			pokemon1.put(pokename,i);
			pokemon2.put(i,pokename);
		}
		

		for(int i=0; i<M; i++){
			String quiz = br.readLine();
			if(quiz.charAt(0) >= '0' && quiz.charAt(0) <= '9'){
				int quiznum = Integer.parseInt(quiz);
				sb.append(pokemon2.get(quiznum-1)).append('\n');
			}else{
				sb.append(pokemon1.get(quiz)+1).append('\n');
			}
		}
		
		System.out.println(sb);
		

	}
}
