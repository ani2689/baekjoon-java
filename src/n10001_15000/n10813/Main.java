package n10001_15000.n10813;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] box = new int[n];

        for(int a = 0; a < n; a++){
            box[a] = a + 1;
        }

        for(int b = 0; b < m; b++){
            int i = sc.nextInt();
            int j = sc.nextInt();

            int temp = box[i-1];
            box[i-1] = box[j-1];
            box[j-1] = temp;

        }

        for(int output: box){
            System.out.print(output+" ");
        }

    }
}
