package n1000_5000.n2798;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] input;

    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        input = new int[sc.nextInt()];
        m = sc.nextInt();
        int max = 0;

        for(int i = 0; i < input.length; i++){
            input[i] = sc.nextInt();
        }

        for(int i = input.length-1; i >= 2 ; i--){
            if(input[i]>=m)
                continue;
            for(int j = input.length-2; j >= 1 ; j--){
                if(i==j||input[i]+input[j]>=m)
                    continue;
                for (int k = input.length-3; k >= 0; k--){
                    if(k==i||k==j)
                        continue;
                    if(input[i]+input[j]+input[k]<=m&&max<input[i]+input[j]+input[k]){
                        max = input[i]+input[j]+input[k];
                    }
                }
            }
        }

        System.out.println(max);

    }


}
