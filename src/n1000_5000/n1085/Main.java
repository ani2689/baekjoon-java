package n1000_5000.n1085;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int[] move = {h-y, y, w-x, x};

        int min = 10000;

        for(int i = 0; i < 4; i++)
            if(move[i] < min )
                min = move[i];

        System.out.println(min);

    }
}
