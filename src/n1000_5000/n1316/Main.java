package n1000_5000.n1316;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> input = new ArrayList<>();

        int inputCount = sc.nextInt();
        sc.nextLine();
        int count = 0;

        for(int i = 0; i < inputCount; i++)
            input.add(sc.nextLine());

        for(String s: input){
            List<Character> appearChar = new ArrayList<>();
            appearChar.add(s.charAt(0));
            int error = 0;
            for(int i = 1; i < s.length(); i++){
                if(appearChar.contains(s.charAt(i))&&s.charAt(i)!=s.charAt(i-1)){
                    error++;
                }
                appearChar.add(s.charAt(i));
            }
            if(error == 0)
                count++;
        }

        System.out.println(count);

    }
}
