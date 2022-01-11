package silver4;
import java.util.*;

public class facto_zero_1676 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 1 <= N <= 500
        sc.close();
        int count = 0; //0의 갯수

        while(N >= 5){
            count += N/5;
            N /= 5;
        }
        System.out.println(count);
    }
}

/* 1차 시도 : 모든 factorial의 값을 전부 계산한 뒤 10으로 나눔.
    -> 실패 : 시간초과
              입력값의 가장 큰 값인 500의 factorial은 엄청나게 큰 수
   2차 시도 : 소인수분해 실시.
    -> 소인수분해 했을 때 2와 5가 있는 공통적개수가 0의 개수일 것.
       소인수분해를 했을 때 항상 2의 갯수 >= 5의 갯수 이므로 5의 갯수에만 신경씀.
        ex) 30 소인수분해 시 => 2 * 3 * 5 이므로 0의 개수 : 1
 */

