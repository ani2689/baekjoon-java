package n10001_15000.n10988;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String compare = new StringBuffer(input).reverse().toString();
        if(input.equals(compare))
            System.out.println(1);
        else
            System.out.println(0);

    }
}
