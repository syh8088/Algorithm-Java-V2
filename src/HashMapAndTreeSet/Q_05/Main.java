package HashMapAndTreeSet.Q_05;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
/*
        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
*/

        int n = 10;
        int k = 3;

        int[] arr = { 13, 15, 34, 23, 45, 65, 33, 11, 26, 42 };

        Main main = new Main();
        System.out.println(main.solution(arr, n, k));
    }

    // 내가 풀어본거
    public int solution(int[] arr, int n, int k) {

        int answer = 0;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        return answer;
    }
}
