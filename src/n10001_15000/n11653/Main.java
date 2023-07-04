package n10001_15000.n11653;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for(int i = 2; input>1&&i<=input;){
            if(input%i==0){
                System.out.println(i);
                input/=i;
            }else{
                i++;
            }
        }
    }
}
