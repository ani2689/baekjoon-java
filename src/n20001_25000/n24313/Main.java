package n20001_25000.n24313;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        for(int i = n; i <= 100; i++){
            if((a1*i)+a0>(c*i)){
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);
    }
}
