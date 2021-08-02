package TowPointersAndSlidingWindow.Q_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < n; i++) {
            arr2[i] = in.nextInt();
        }*/

        int n = 5;
        int[] arr = { 1, 3, 9, 5, 2 };

        int m = 5;
        int[] arr2 = { 3, 2, 5, 7, 8 };

        Main main = new Main();

        for (int x : main.solution(n, arr, m, arr2)) {
            System.out.print(x + " ");
        }

    }


    // 내가 풀어본거
    public ArrayList<Integer> solution(int n, int[] arr, int m, int[] arr2) {

       ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(arr);
        Arrays.sort(arr2);

        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (arr[p1] < arr2[p2]) {
                p1++;
            } else if (arr[p1] == arr2[p2]) {
                answer.add(arr[p1]);
                p1++;
                p2++;
            } else {
                p2++;
            }
        }

        return answer;
    }

}