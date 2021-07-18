package Array.Array_2_09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
*/
//arr[0][0]
//arr[1][1]
//
//        arr[0][4]
//        arr[1][3]
//        arr[2][2]
//        arr[3][1]
//        arr[4][0]

        int n = 5;
        int[][] arr = {
                { 10, 13, 10, 12, 15 },
                { 12, 39, 30, 23, 11 },
                { 11, 25, 50, 53, 15 },
                { 19, 27, 29, 37, 27 },
                { 19, 13, 30, 13, 19 }
        };

        Main main = new Main();
        System.out.print(main.solution(n, arr));
    }

    // 내가 풀어본거
    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;

        int diagonalLeftSum = 0;
        int diagonalRightSum = 0;
        for (int i = 0; i < n; i++) {

            int rowSum = 0;
            int colSum = 0;

            int diagonalLeft = arr[i][i];
            int diagonalRight = arr[i][n - i - 1];
            diagonalLeftSum += diagonalLeft;
            diagonalRightSum += diagonalRight;

            int[] ints = arr[i];
            for (int j = 0; j < n; j++) {
                int anInt = ints[j];
                rowSum += anInt;

                int col = arr[j][i];
                colSum += col;
            }

            answer = Math.max(answer, rowSum);
            answer = Math.max(answer, colSum);
            answer = Math.max(answer, diagonalLeftSum);
            answer = Math.max(answer, diagonalRightSum);
        }

        return answer;
    }

}
