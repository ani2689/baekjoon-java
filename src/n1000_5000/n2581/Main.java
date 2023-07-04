package n1000_5000.n2581;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = 10000;
        int sum = 0;

        for(int i = a; i <= b; i++){

            if(i==1)
                continue;

            int isM = 0;
            for(int j = 2; j < i; j++){
                if(i%j==0){
                    isM++;
                    break;
                }
            }

            if(isM==0){
                if(min>=i)
                    min = i;
                sum+=i;
            }
        }


        if(sum!=0){
            System.out.println(sum);
            System.out.println(min);
        }else
            System.out.println(-1);

    }
}
