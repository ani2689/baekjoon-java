package n1000_5000.n1978;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++){
            int input = sc.nextInt();

            if(input==1)
                continue;

            int isM = 0;
            for(int j = 2; j < input; j++ ){
                if(input%j==0){
                    isM++;
                    break;
                }
            }

            if(isM==0)
                count++;
        }

        System.out.println(count);
    }
}
