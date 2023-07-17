package n5001_10000.n5073;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputA = 0;
        int inputB = 0;
        int inputC = 0;

        while (true){
            int[] input = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
            Arrays.sort(input);
            if(input[0]==0&&input[1]==0&&input[2]==0)
                return;
            else if(input[2]>=input[1]+input[0])
                System.out.println("Invalid");
            else if(input[0]==input[1]&&input[2]==input[1])
                System.out.println("Equilateral");
            else if(input[0]==input[1]||input[2]==input[1]||input[2]==input[0])
                System.out.println("Isosceles");
            else
                System.out.println("Scalene");

        }
    }
}
