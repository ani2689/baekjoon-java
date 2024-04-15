package n10001_15000.n11651;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int[][] map = new int[count][2];

        for(int i = 0; i < count; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            map[i][0] = x;
            map[i][1] = y;
        }

        Arrays.sort(map, (e1, e2) -> {
            if(e1[0] == e2[0])
                return e1[1] - e2[1];
            else
                return e1[0] - e2[0];
        });

        for(int i = 0; i < count; i++)
            System.out.println(map[i][0] + " " + map[i][1]);
    }
}