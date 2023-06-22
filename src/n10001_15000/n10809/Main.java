package n10001_15000.n10809;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abc = new int[26];
        for (int i = 0; i < 26; i++)
            abc[i] = -1;

        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (abc[input.charAt(i) - 97] == -1)
                abc[input.charAt(i) - 97] = i;


        }

        for (int output : abc)
            System.out.print(output + " ");
    }
}
