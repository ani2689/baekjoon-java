package n10001_15000.n10101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputA = sc.nextInt();
        int inputB = sc.nextInt();
        int inputC = sc.nextInt();

        if(inputA+inputB+inputC!=180)
            System.out.println("Error");
        else if(inputA==60&&inputB==60&&inputC==60)
            System.out.println("Equilateral");
        else if(inputA==inputB||inputA==inputC||inputB==inputC)
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");
    }
}
