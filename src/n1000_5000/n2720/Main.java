package n1000_5000.n2720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nOfcase = sc.nextInt();

        for(int i = 0; i < nOfcase; i++){
            int input = sc.nextInt();
            int q = input/25;
            int d = (input%25)/10;
            int n = ((input%25)%10)/5;
            int p = ((input%25)%10)% 5;
            System.out.println(q + " " + d + " " + n + " " + p);
        }
    }
}
