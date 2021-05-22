package Array.Array_2_04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //int n = 10;
        Main main = new Main();
        for (int x : main.solution(n)) {
            System.out.print(x + " ");
        }
    }

    // 내가 풀어본거
    public int[] solution(int n) {

        int[] answer = new int[n];

        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }

}
