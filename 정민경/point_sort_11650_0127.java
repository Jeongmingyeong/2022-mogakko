package silver5;
import java.util.*;

public class point_sort_11650_0127 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 입력받는 줄수
        sc.nextLine();
        int[][] data = new int[N][2];
        int[] temp = new int[2];

        for(int i = 0; i < N; i++){
            String[] str = sc.nextLine().split(" ");
            data[i][0] = Integer.parseInt(str[0]);
            data[i][1] = Integer.parseInt(str[1]);
        }
        Arrays.sort(data, (t1, t2) -> {
            if(t1[0] == t2[0]){
                return t1[1] - t2[1];
            }
            else {
                return t1[0] - t2[0];
            }
        });
        Arrays.sort(data, (t1, t2) -> { // y좌표 정렬
            if(t1[0] == t2[0]){
                return t1[1] - t2[1];
            }
            else {
                return t1[0] - t2[0];
            }
        });

        for(int i = 0; i < N; i++){
            System.out.println(data[i][0] + " " + data[i][1]);
        }

        sc.close();
    }
}
