package n10001_15000.n10871;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int compare = sc.nextInt();

        int[] input = new int[num];
        for(int i=0;i<num;i++){
            input[i] = sc.nextInt();
        }
        for(int target: input){
            if(target<compare)
                System.out.print(target+" ");
        }
    }
}
