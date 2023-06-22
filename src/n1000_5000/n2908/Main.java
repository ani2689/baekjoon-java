package n1000_5000.n2908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        StringBuilder reverse1 = new StringBuilder();
        StringBuilder reverse2 = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            reverse1.append(a.charAt(i));
            reverse2.append(b.charAt(i));
        }

        int out1 = Integer.parseInt(reverse1.toString());
        int out2 = Integer.parseInt(reverse2.toString());

        System.out.println(Math.max(out1, out2));

    }
}
