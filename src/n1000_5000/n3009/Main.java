package n1000_5000.n3009;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> la = new ArrayList<>();
        List<Integer> lb = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(la.contains(a))
                la.remove(Integer.valueOf(a));
            else
                la.add(a);

            if (lb.contains(b))
                lb.remove(Integer.valueOf(b));
            else
                lb.add(b);


        }

        System.out.println(la.get(0)+" "+ lb.get(0));

    }
}
