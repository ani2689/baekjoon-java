package n1000_5000.n1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] input = new Scanner(System.in).nextLine().split(" ");
        try {
            if(input[0].equals(""))
                System.out.println(input.length-1);
            else
                System.out.println(input.length);
        }catch (Exception e) {
            System.out.println("0");
        }
    }
}
