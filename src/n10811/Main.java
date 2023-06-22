package n10811;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] box = new int[n];
        int[] newBox = new int[n];
        for(int a = 0; a < n; a++){
            box[a] = a+1;
        }

        for(int b = 0; b < m; b++){
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;

            System.arraycopy(box, 0, newBox, 0, box.length);
            for(int c = i; c <=j; c++){
                newBox[i+j-c] = box[c];
            }
            System.arraycopy(newBox, 0, box, 0, box.length);
        }

        for(int output: box)
            System.out.print(output + " ");
    }

}
