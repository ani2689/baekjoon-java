package n1000_5000.n2941;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String word = new Scanner(System.in).nextLine();
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'c') {
                if (i < word.length() - 1) {
                    char nextChar = word.charAt(i + 1);
                    if (nextChar == '=' || nextChar == '-')
                        i++;
                }
            } else if (c == 'd') {
                if (i < word.length() - 1) {
                    char nextChar = word.charAt(i + 1);
                    if (nextChar == '-')
                        i++;
                    else if (nextChar == 'z') {
                        if (i < word.length() - 2 && word.charAt(i + 2) == '=')
                            i += 2;
                    }
                }
            } else if (c == 'l' || c == 'n') {
                if (i < word.length() - 1 && word.charAt(i + 1) == 'j')
                    i++;
            } else if (c == 's' || c == 'z')
                if (i < word.length() - 1 && word.charAt(i + 1) == '=')
                    i++;

            count++;
        }
        System.out.println(count);
    }


}
