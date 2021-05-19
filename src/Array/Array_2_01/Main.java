package Array.Array_2_01;

import java.util.*;

public class Main {

    public static void main(String[] args) {

/*        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }*/

        int n = 6;
        int[] arr = { 7, 3, 9, 5, 6, 12 };

        Main main = new Main();

        for (int x : main.solution(n, arr)) {
            System.out.print(x + " ");
        }

    }


    // 내가 풀어본거
    public ArrayList<Integer> solution(int input1, int[] input2) {

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(input2[0]);
        for (int i = 1; i < input1; i++) {
            if (input2[i] >= input2[i - 1]) {
                integers.add(input2[i]);
            }
        }

        return integers;
    }




    Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer a, Integer b) {
            return a - b;
        }
    };


}
