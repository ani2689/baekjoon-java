package n1000_5000.n2231;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i = 0; i < input; i++){
            List<Integer> boon = new ArrayList<>();
            boon.add(0);

            int _a = i;
            int sum = 0;

            while (_a!=0){
                boon.add(_a%10);
                _a/=10;
            }

            for (int j = 1; j < boon.size(); j++){
                sum+=boon.get(j);
            }

            if(i+sum==input){
                int result = 0;
                for (int j = 0; j < boon.size(); j++){
                    result += boon.get(j)*(int)(Math.pow(10, j-1));
                }
                System.out.println(result);
                return;
            }

        }

        System.out.println(0);
    }
}
