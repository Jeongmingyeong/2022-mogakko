package silver5;
import java.util.*;

public class reverse_1439_0125 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("");
        String compare = str[0];
        int count = 0;

        for(int i = 0; i < str.length; i++){
            if(!str[i].equals(compare)){
                count++;
                compare = str[i];
            }
        }
        if(count == 0 || count == 1) {
            System.out.println(count);
        }
        else{
            System.out.println(count % 2 == 0 ? count / 2 : count / 2 + 1);
        }
    }
}
