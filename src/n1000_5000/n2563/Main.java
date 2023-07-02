package n1000_5000.n2563;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nOfpaper = sc.nextInt();

        int[][] artBoard = new int[100][100];
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                artBoard[i][j] = 0;
            }
        }

        for(int i = 0; i < nOfpaper; i++){
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            for(int j = x; j < x+10; j++){
                for(int k = y; k < y+10; k++ ){
                    artBoard[j][k] = 1;}
            }
        }

        int count = 0;

        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(artBoard[i][j] == 1){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
