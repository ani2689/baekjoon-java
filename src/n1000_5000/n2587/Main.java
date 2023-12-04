package n1000_5000.n2587;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        int n = 0;

        for(int i = 0; i < 5; i++) {
            int input = scanner.nextInt();
            n += input;
            numbers[i] = input;
        }

        Arrays.sort(numbers);

        System.out.println(n/5);
        System.out.println(numbers[2]);
    }
}
