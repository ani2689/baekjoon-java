package n5001_10000.n9506;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=-1;

        while (true){
            n = sc.nextInt();

            if(n==-1)
                return;

            int equal=0;
            List<Integer> minis = new ArrayList<>();

            for(int i = 1; i < n; i++)
                if(n%i==0) {
                    equal += i;
                    minis.add(i);
                }

            if(equal == n){
                System.out.print(n + " =");
                for(int i = 0; i < minis.size(); i++)
                    if(i==minis.size()-1)
                        System.out.print(" " + minis.get(i));
                    else
                        System.out.print(" " + minis.get(i) + " +");
            }
            else
                System.out.print(n+" is NOT perfect.");
            System.out.println();
        }
    }
}
