package silver4;
import java.util.*;

public class gwalho_11899_0118 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] S = sc.nextLine().split("");
        int count = 0;
        int opencount = 0;
        for(int i = 0; i < S.length; i++){
            if(S[i].equals("(")){
                count++;
                opencount++;
            }
            else{
                if(opencount == 0){
                    count++;
                }
                else{
                    opencount --;
                    count--;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
