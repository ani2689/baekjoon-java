package n5001_10000.n9063;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int up = -10000;
        int down = 10000;
        int left = 10000;
        int right = -10000;


        for(int i = 0; i < count; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(up<y)
                up=y;
            if(down>y)
                down=y;
            if(left>x)
                left=x;
            if(right<x)
                right=x;

        }

        System.out.println((up-down)*(right-left));
    }
}
