package n10001_15000.n11005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int B = scanner.nextInt();

        String result = convert(N, B);

        System.out.println(result);
    }

    public static String convert(int N, int B) {

        StringBuilder baseN = new StringBuilder();

        while (N > 0) {
            int remainder = N % B;
            if (remainder < 10) {
                baseN.insert(0, remainder); // 숫자인 경우 그대로 추가
            } else {
                char digit = (char) ('A' + remainder - 10); // 알파벳으로 변환하여 추가
                baseN.insert(0, digit);
            }
            N /= B;
        }

        return baseN.toString();
    }
}

