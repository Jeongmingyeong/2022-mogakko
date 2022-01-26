package silver5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class room_number_1475_0125 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split("");
        int[] number = new int[num.length];
        int[] numset = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // 숫자 몇개나왔는지 세는 배열

        for(int i = 0; i < num.length; i++) {
            number[i] = Integer.parseInt(num[i]);
            numset[number[i]] ++;
        }

        int N = numset[6] + numset[9];
        if(N % 2 == 0){
            numset[6] = N / 2;
            numset[9] = N / 2;
        }
        else {
            numset[6] = N / 2 + 1;
            numset[9] = N / 2 + 1;
        }
        int max = 0;
        for(int i = 0; i < 10; i++){
            if(max < numset[i]){
                max = numset[i];
            }
        }

        System.out.println(max);

        br.close();

    }
}

// 배열의 값을 선언과 동시에 지정할 때는 대괄호[]가 아니라 중괄호{}