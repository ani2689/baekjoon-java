package n1000_5000.n2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i = 0; i < count; i++){
            int cycle = sc.nextInt();
            String input = sc.next();
            for(int j = 0; j < input.length(); j++){
                for(int k = 0; k < cycle; k ++){
                    System.out.print(input.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
