package n1000_5000.n2566;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        int m = -1;
        int max = -1;
        int i = 0;
        int j = 0;

        for(i = 0; i < 9; i++){
            for(j = 0; j < 9; j++){
                int input = sc.nextInt();
                if(input > max){
                    max = input;
                    n = i;
                    m = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(n+1 + " " + (m+1));
    }
}
