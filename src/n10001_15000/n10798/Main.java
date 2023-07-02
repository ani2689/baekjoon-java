package n10001_15000.n10798;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = new String[5];
        int maxLen = 0;

        for(int i = 0; i < 5; i++){
            input[i] = sc.nextLine();
            if(maxLen < input[i].length())
                maxLen = input[i].length();
        }

        for(int i = 0; i < maxLen; i++)
            for (String s : input)
                if (s.length() > i)
                    System.out.print(s.charAt(i));

    }
}
