package n10807;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] input = new int[num];
        for(int i=0;i<num;i++){
            input[i] = sc.nextInt();
        }
        int findNum = sc.nextInt();
        int count = 0;
        for(int target: input){
            if(target==findNum)
                count++;
        }
        System.out.println(count);
    }
}
