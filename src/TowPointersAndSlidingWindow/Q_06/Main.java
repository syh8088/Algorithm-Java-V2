package TowPointersAndSlidingWindow.Q_06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }*/

        int n = 14;
        int k = 2;
        int[] arr = { 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 };

        Main main = new Main();
        System.out.print(main.solution(n, k, arr));
    }

    // 내가 풀어본거
    public int solution(int n, int k, int[] arr) {

        int answer = 0, cnt = 0, lt = 0;

        
        return answer;
    }

}