package silver4;
import java.util.*;

public class average_2108_0118 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // N은 홀수
        int[] num = new int[N];
        int[] arr = new int[8001]; // 최빈값을 찾기위한 배열
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        double average = 0; // 산술평균 = sum/N
        int middle_num = 0; // 중앙값
        int often_num = 0; // 최빈값
        int boundary = 0; // 범위

        for(int i = 0; i < N; i++){
            num[i] = sc.nextInt();
            sum += num[i];
            arr[num[i] + 4000]++;
        }

        Arrays.sort(num); // 오름차순 정렬

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                list.add(i-4000);
            }
        }
        if(list.size() == 1){
            often_num = list.get(0);
        }
        else{
            Collections.sort(list);
            often_num = list.get(1);
        }

        average = Math.round((double) sum/N);
        middle_num = num[N/2];
        boundary = num[N-1] - num[0];

        System.out.println((int) average);
        System.out.println(middle_num);
        System.out.println(often_num);
        System.out.println(boundary);


        sc.close();
    }
}
