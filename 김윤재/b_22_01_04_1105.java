import java.util.*;
public class b_22_01_04_1105{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int cnt = 0;
        if (a.length() != b.length()){
            System.out.println(0);
        }
        else{
            for (int i = 0; i < a.length(); i++){
                if (a.charAt(i) == b.charAt(i) && a.charAt(i) =='8'){
                    cnt += 1;
                }
                else if (a.charAt(i) < b.charAt(i)){
                    break;
                }
            }
            System.out.println(cnt);
        }
    }
}