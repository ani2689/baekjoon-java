package n11022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 0;i<input;i++){
            int a=sc.nextInt();
            int b= sc.nextInt();
            System.out.println("Case #"+(i+1)+ ": " + a + " + " + b + " = " +(a+b));
        }
    }
}
