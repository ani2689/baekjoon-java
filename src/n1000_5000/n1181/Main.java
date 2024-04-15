package n1000_5000.n1181;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.nextLine();

        String[] list = new String[count + 1];

        list[0] = "";

        for(int i = 1; i <= count; i++){
            list[i] = sc.nextLine();
        }

        Arrays.sort(list, (e1, e2) -> {
            if(e1.length() == e2.length()){
                return e1.compareTo(e2);
            } else
                return e1.length() - e2.length();
        });

        for(int i = 1; i <= count; i++) {
            if(list[i-1].equals(list[i]))
                continue;
            System.out.println(list[i]);
        }
    }
}
