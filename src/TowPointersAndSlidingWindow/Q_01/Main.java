package TowPointersAndSlidingWindow.Q_01;

import java.util.ArrayList;
import java.util.Comparator;

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
        }
        */

        int n = 3;
        int[] arr = { 1, 3, 5 };

        int m = 5;
        int[] arr2 = { 2, 3, 6, 7, 9 };

        Main main = new Main();

        for (int x : main.solution(n, arr, m, arr2)) {
            System.out.print(x + " ");
        }

    }


    // 내가 풀어본거
    public ArrayList<Integer> solution(int n, int[] arr, int m, int[] arr2) {

       ArrayList<Integer> answer = new ArrayList<>();

        return answer;
    }




    Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer a, Integer b) {
            return a - b;
        }
    };


}
