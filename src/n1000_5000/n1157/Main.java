package n1000_5000.n1157;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inBox = new int[26];
        Arrays.fill(inBox, 0);

        int maxNum=-1;
        int maxHang=-1;
        int equal=0;

        String input = sc.nextLine().toLowerCase();

        for(int i = 0; i < input.length(); i++){
            inBox[(byte)(input.charAt(i)) - 97]++;
        }

        for(int i = 0; i < 26; i++){
            if(maxNum<inBox[i]){
                maxNum = inBox[i];
                maxHang = i;
                equal=0;
            } else if (maxNum==inBox[i]) {
                equal++;
            }
        }

        if(equal!=0){
            System.out.println("?");
        } else {
            System.out.println((char)(maxHang + 65));
        }

    }
}
