package StackAndQueue.Q_02;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

       /* String str = in.next();*/

        String str = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";

        Main main = new Main();
        System.out.print(main.solution(str));
    }

    // 내가 풀어본거
    public String solution(String str) {

        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        return answer.toString();
    }

}