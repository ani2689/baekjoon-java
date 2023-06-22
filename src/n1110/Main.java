package n1110;

import java.util.Scanner;

public class Main {
    static int input;
    static int fn;
    static int ln;
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        split(input);

        System.out.println(count);
    }

    public static void split(int a){
        if(a==input&&count!=0)
            return;

        int sum=((a%10)*10)+((a/10)+(a%10))%10;
        count++;
        split(sum);

    }
}

