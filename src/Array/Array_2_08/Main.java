package Array.Array_2_08;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    /*    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }*/

        int n = 5;
        int[] arr = { 87, 92, 92, 100, 76 };

        Main main = new Main();
        for (int x : main.solution(n, arr)) System.out.print(x + " ");
    }

    // 내가 풀어본거
    public int[] solution(int n, int[] arr) {

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            int i1 = arr[i];

            for (int j = 0; j < n; j++) {
                int i2 = arr[j];
                if (i1 < i2) {
                    cnt++;
                }
            }

            result[i] = cnt;
        }

        return result;
    }

}
