package Array.Array_2_11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[][] arr = new int[n + 1][6];
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= 5; j++) {
//                arr[i][j] = in.nextInt();
//            }
//        }


        int n = 5;
        int[][] arr = {
                { 2, 3, 1, 7, 3 },
                { 4, 1, 9, 6, 8 },
                { 5, 5, 2, 4, 4 },
                { 6, 5, 2, 6, 7 },
                { 8, 4, 2, 2, 2 }
        };

        Main main = new Main();
        System.out.print(main.solution(n, arr));
    }

    // 내가 풀어본거
    public int solution(int n, int[][] arr) {

        int answer = 0;

        for (int i = 0; i < n; i++) {

            int count = 0;
            int[] ints = arr[i];

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int anInt = ints[j];
                    if (anInt == arr[i][j]) {
                        count++;
                    }
                }
            }

            answer = Math.max(answer, count);
        }

        return answer;
    }


    public int solution1(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;

            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }
}
