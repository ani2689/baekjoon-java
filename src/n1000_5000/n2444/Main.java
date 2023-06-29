package n1000_5000.n2444;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = N - 1; i >= 1; i--){
            for (int j = 1; j <= N - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
