package n10001_15000.n13458;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int b = sc.nextInt();
        int c = sc.nextInt();

        Long rs = 0L;

        for(int currentSt: a){
            int out = currentSt - b;
            if(out <= 0){
                rs+=1;
            }else if(out % c == 0){
                rs+=1+out/c;
            }
            else{
                rs+=2+out/c;
            }
        }

        System.out.println(rs);
    }
}
