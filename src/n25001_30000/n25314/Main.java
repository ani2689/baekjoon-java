package n25001_30000.n25314;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i=0;i<input/4;i++)
            System.out.print("long ");
        System.out.print("int");
    }
}
