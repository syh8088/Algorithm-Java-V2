package HashMapAndTreeSet.Q_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

/*        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }*/
        int n = 7;
        int k = 4;

        int[] arr = { 20, 12, 20, 10, 23, 17, 10 };

        Main main = new Main();
        for (int x : main.solution(n, k, arr)) System.out.print(x + " ");
    }

    // 내가 풀어본거
    public ArrayList<Integer> solution(int n, int k, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();



        return answer;
    }
}
