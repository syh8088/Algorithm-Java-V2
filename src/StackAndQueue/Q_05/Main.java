package StackAndQueue.Q_05;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        String str = in.next();


       // String str = "()(((()())(())()))(())";

        Main main = new Main();
        System.out.print(main.solution(str));
    }

    // 내가 풀어본거
    public int solution(String str) {

        int answer = 0;
        Stack<Character> stack = new Stack<>();

        char preC = 0;

        for (char c : str.toCharArray()) {

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {

                if (preC == ')') {

                    stack.pop();
                    answer += 1;

                } else { // 레이저
                    stack.pop();
                    answer += stack.size();
                }


            }


            preC = c;

        }


        return answer;
    }

}