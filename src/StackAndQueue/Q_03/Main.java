package StackAndQueue.Q_03;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

/*       int n = in.nextInt();
       int[][] board = new int[n][n];
       for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = in.nextInt();
            }
       }

       int movesLength = in.nextInt();
       int[] moves = new int[movesLength];
       for (int i = 0; i < movesLength; i++) moves[i] = in.nextInt();*/


        int n = 5;
        int[][] board = {
                { 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 3 },
                { 0, 2, 5, 0, 1 },
                { 4, 2, 4, 4, 2 },
                { 3, 5, 1, 3, 1 }
        };

        int movesLength = 8;
        int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

        Main main = new Main();
        System.out.print(main.solution(n, board, movesLength, moves));
    }

    // 내가 풀어본거
    public int solution(int n, int[][] board, int movesLength, int[] moves) {

        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < movesLength; i++) {
            int move = moves[i] - 1;

            for (int e = 0; e < n; e++) {

                int i1 = board[e][move];
                if (i1 != 0) {
                    if (!stack.empty() && stack.peek() == i1) {
                        stack.pop();
                        answer = answer + 2;
                    } else {
                        stack.push(i1);
                    }

                    board[e][move] = 0;
                    break;
                }
            }
        }

        return answer;
    }

}