package Array.Array_2_02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

       // int n = 8;
       // int[] arr = { 130, 135, 148, 140, 145, 150, 150, 153 };

        Main main = new Main();
        System.out.print(main.solution(n, arr));
    }

    public int solution(int n, int[] arr) {
        int answer = 1, max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }

        return answer;
    }

    // 내가 풀어본거 (틀린거...)
/*
    public int solution(int n, int[] arr) {

        int result = 0;
        int target = arr[0];

        for (int i = 1; i < n; i++) {
            int i1 = arr[i];
            if (target < i1) {
                result++;
                target = i1;

                if (i == n - 1) result++;
            }


        }

        return result;
    }
*/


}
