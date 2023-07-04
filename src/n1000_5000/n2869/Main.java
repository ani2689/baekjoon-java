package n1000_5000.n2869;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long v = sc.nextInt();

        if((v-a)%(a-b)==0)
            System.out.println((int)(v-a)/(a-b)+1);
        else
            System.out.println((int)(v-a)/(a-b)+2);
    }
}
