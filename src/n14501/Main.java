package n14501;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int[] period = new int[day+1];
        int[] salary = new int[day+1];
        int[] maxSalary = new int[day+2];

        for (int i = 1; i <= day; i++) {
            period[i] = sc.nextInt();
            salary[i] = sc.nextInt();
        }

        for (int i = day; i >= 1; i--) {
            int nextDay = i + period[i];
            if (nextDay > day + 1) {
                maxSalary[i] = maxSalary[i+1];
            } else {
                maxSalary[i] = Math.max(salary[i] + maxSalary[nextDay], maxSalary[i+1]);
            }
        }

        System.out.println(maxSalary[1]);
    }

}
