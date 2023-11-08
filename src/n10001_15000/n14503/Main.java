package n10001_15000.n14503;

import java.util.Scanner;

public class Main {
    static int N, M;
    static int[][] room;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        int r = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        room = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                room[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        while (true) {
            if (room[r][c] == 0) {
                room[r][c] = 2;
                count++;
            }

            boolean canMove = false;

            for (int i = 0; i < 4; i++) {
                d = (d + 3) % 4;
                int nr = r + dx[d];
                int nc = c + dy[d];

                if (room[nr][nc] == 0) {
                    r = nr;
                    c = nc;
                    canMove = true;
                    break;
                }
            }

            if (!canMove) {
                int backDir = (d + 2) % 4;
                int nr = r + dx[backDir];
                int nc = c + dy[backDir];

                if (room[nr][nc] == 1)
                    break;

                r = nr;
                c = nc;
            }
        }

        System.out.println(count);
    }
}
