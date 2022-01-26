package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class X_23055_0125 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        //int size = br.read(); // 표지판 사이즈
        int size = sc.nextInt();
        String[][] X = new String[size][size];

        for(int i = 0 ; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i == 0 || i == size-1 || j == 0 || j == size-1 || j == i || j == size-i-1){
                    X[i][j] = "*";
                }
                else{
                    X[i][j] = " ";
                }
            }
        }

        for(int i = 0 ; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(X[i][j]);
            }
            System.out.println();
        }
    }
}