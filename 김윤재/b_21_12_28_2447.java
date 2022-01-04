import java.io.*;
import java.util.*;
public class b_21_12_28_2447 {
    
    public static String[] star_rec(int n){
        if (n == 1){
            String[] arr = new String[3];
            arr[0] = "***";
            arr[1] = "* *";
            arr[2] = "***";
            return arr;
        }
        else{
            int k = 1;
            for (int i = 0; i < n; i++){
                k *= 3;
            }
            String[] arr = new String[k];
            for (int i = 0 ; i < arr.length; i++){
                arr[i] = "";
            }
            String[] arr_1 = star_rec(n-1);
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < arr_1.length; j++){
                    if (i == 1){
                        String str = "";
                        for (int f = 0; f < arr_1[0].length(); f++){
                            str += " ";
                        }
                            arr[i*arr_1.length + j] += arr_1[j];
                            arr[i*arr_1.length + j] += str;
                            arr[i*arr_1.length + j] += arr_1[j];
                    }
                    else{
                        arr[i*arr_1.length + j] += arr_1[j];
                        arr[i*arr_1.length + j] += arr_1[j];
                        arr[i*arr_1.length + j] += arr_1[j];
                    }
                }
            }
            return arr;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        int k = input;
        int cnt = 0;
        while (k != 1){
            k /= 3;
            cnt += 1;
        }
        String[] arr = star_rec(cnt);
        for (int i = 0; i < input; i++){
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
