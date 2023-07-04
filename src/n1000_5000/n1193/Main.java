package n1000_5000.n1193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();

        int row = 1;
        int son = 1;
        int mom = 1;

        for(int i = 1; i < x;i++)
            if(son==1&&row%2==1){
                mom++;
                row++;
            }else if(mom==1&&row%2==0){
                son++;
                row++;
            }else if(row%2==0){
                mom--;
                son++;
            }else if(row%2==1) {
                son--;
                mom++;
            }

        System.out.println(son + "/" + mom);
    }
}
