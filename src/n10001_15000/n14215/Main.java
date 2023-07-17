package n10001_15000.n14215;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = {sc.nextInt(),sc.nextInt(),sc.nextInt()};

        Arrays.sort(input);

        if(input[2]>=input[1]+input[0])
            System.out.println(input[1]+input[0]+(input[1]+input[0]-1));
        else
            System.out.println(input[0]+input[1]+input[2]);
    }
}
