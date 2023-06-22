package n10001_15000.n11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String input = sc.next();
        int result = 0;
        for(int i=0; i<count; i++){
            result+=Character.getNumericValue(input.charAt(i));
        }
        System.out.println(result);
    }
}
