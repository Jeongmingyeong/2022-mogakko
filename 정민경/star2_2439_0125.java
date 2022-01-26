package bronze3;

import java.util.Scanner;

public class star2_2439_0125 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            System.out.print(" ".repeat(N-1-i));
            System.out.print("*".repeat(i+1));
            System.out.println();
        }
    }
}
