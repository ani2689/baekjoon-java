package n1000_5000.n2745;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int B = scanner.nextInt();

        int result = convert(N, B);

        System.out.println(result);
    }

    public static int convert(String N, int B) {

        StringBuilder reversedN = new StringBuilder(N).reverse();

        int decimal = 0;
        int power = 0;

        for (int i = 0; i < reversedN.length(); i++) {
            char digit = reversedN.charAt(i);
            int value;
            if (Character.isDigit(digit))
                value = Character.getNumericValue(digit);
            else
                value = digit - 'A' + 10;
            decimal += value * Math.pow(B, power);
            power++;
        }

        return decimal;
    }
}
