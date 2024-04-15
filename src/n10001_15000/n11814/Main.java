package n10001_15000.n11814;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.nextLine();

        String[] names = new String[count];

        for(int i = 0; i < count; i++){
            String input = sc.nextLine();
            names[i] = input + "/" + i;
        }

        Arrays.sort(names, (e1, e2) -> {
            if(e1.split(" ")[0].equals(e2.split(" ")[0])){
                return Integer.parseInt(e1.split("/")[1]) - Integer.parseInt(e2.split("/")[1]);
            } else
                return Integer.parseInt(e1.split(" ")[0]) - Integer.parseInt(e2.split(" ")[0]);
        });

        for(int i = 0; i < count; i++){
            System.out.println(names[i].split("/")[0]);
        }
    }
}
