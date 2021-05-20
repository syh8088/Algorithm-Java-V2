package Array.Array_2_03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
/*        int n = in.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for (int i = 0; i < n; i++) {
            arrA[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arrB[i] = in.nextInt();
        }*/

        int n = 5;
        int[] arrA = { 2, 3, 3, 1, 3 };
        int[] arrB = { 1, 1, 2, 2, 3 };

        Main main = new Main();
        for (char x : main.solution(n, arrA, arrB)) {
            System.out.println(x);
        }
    }

    // 내가 풀어본거
    public char[] solution(int n, int[] arrA, int[] arrB) {

        char[] answer = new char[n];

        for (int i = 0; i < n; i++) {
            int i1 = arrA[i];
            int i2 = arrB[i];

            char c;
            switch (i1 - i2)  {
                case 1:
                case -2:
                    c = 'A';
                    break;
                case 2:
                case -1:
                    c = 'B';
                    break;
                default:
                    c = 'D';
                    break;
            }

            answer[i] = c;
        }

        return answer;
    }

}
