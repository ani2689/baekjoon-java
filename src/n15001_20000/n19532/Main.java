package n15001_20000.n19532;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int _a = sc.nextInt();
        int _b = sc.nextInt();
        int _c = sc.nextInt();
        int _d = sc.nextInt();
        int _e = sc.nextInt();
        int _f = sc.nextInt();

        int a = _a*_d;
        int b = _b*_d;
        int c = _c*_d;
        int d = _d*_a;
        int e = _e*_a;
        int f = _f*_a;

        int left = b - e;
        int right = c - f;

        int y;

        if(left == 0)
            y = 1;
        else
            y = right/left;



        int x;

        if(_a==0){
            left = _d;
            right = _f - (_e * y);
        }
        else{
            left = _a;
            right = _c - (_b * y);
        }

        x = right/left;

        System.out.println(x+" "+y);
    }
}
