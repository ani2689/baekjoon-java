package n25001_30000.n25305;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] input = new int[n];

        for(int i = 0; i < n; i++){
            input[i] = sc.nextInt();
        }

        Arrays.sort(input);

        System.out.println(input[n-k]);
    }
}
