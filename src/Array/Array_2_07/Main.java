package Array.Array_2_07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

     //   int n = 10;
     //   int[] arr = { 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 };

        Main main = new Main();
        System.out.print(main.solution(n, arr));
    }

    // 내가 풀어본거
    public int solution(int n, int[] arr) {

        int answer = 0;
        int count = 1;

        for (int i = 0; i < n; i++) {

            if (arr[i] > 0) {
                answer += count;
                count++;
            } else {
                count = 1;
            }
        }

        return answer;
    }

}
