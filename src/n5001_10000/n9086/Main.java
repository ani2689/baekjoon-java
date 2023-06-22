package n5001_10000.n9086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            String input = sc.next();
            System.out.print(input.charAt(0));
            System.out.print(input.charAt(input.length()-1));
            System.out.println();
        }
    }
}
