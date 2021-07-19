package Array.Array_2_10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }*/


        int n = 5;
        int[][] arr = {
                { 5, 3, 7, 2, 3 },
                { 3, 7, 1, 6, 1 },
                { 7, 2, 5, 3, 4 },
                { 4, 3, 6, 4, 1 },
                { 8, 7, 3, 5, 2 }
        };

        Main main = new Main();
        System.out.print(main.solution(n, arr));
    }

    int[] dx = { -1, 0, 1, 0 };
    int[] dy = { 0, 1, 0, -1 };

    // 내가 풀어본거
    public int solution(int n, int[][] arr) {

        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int i1 = arr[i][j];
                boolean flag = isMountaintop(i, j, arr, i1, n);
                if (flag) answer++;
            }
        }

        return answer;
    }

    private boolean isMountaintop(int i, int j, int[][] arr, int value, int n) {

        for (int x = 0; x < dx.length; x++) {
            int nx = i + dx[x];
            int ny = j + dy[x];

            if (nx > 0 && nx < n && ny >=0 && ny < n && value <= arr[nx][ny]) return false;
        }

        return true;
    }
}
