package n25001_30000.n25206;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sumAll = 0.000000;
        double sum = 0.000000;


        for(int i = 0; i < 20; i++) {
            sc.next();
            double rating = sc.nextDouble();
            String grades = sc.next();
            sc.nextLine();
            if(grades.equals("P")){
                continue;
            }
            sumAll+=toD(grades)*rating;
            sum+=rating;
        }

        System.out.println(sumAll/sum);


    }

    static double toD(String s){
        switch (s){
            case "A+":
                return 4.50000;
            case "A0":
                return 4.00000;
            case "B+":
                return 3.50000;
            case "B0":
                return 3.00000;
            case "C+":
                return 2.50000;
            case "C0":
                return 2.00000;
            case "D+":
                return 1.50000;
            case "D0":
                return 1.00000;
            case "F":
                return 0.00000;
            default:
                return -1.00000;
        }
    }

}
