package StackAndQueue.Q_04;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        String str = in.next();


        //String str = "352+*9-";

        Main main = new Main();
        System.out.print(main.solution(str));
    }

    // 내가 풀어본거
    public int solution(String str) {

        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        int lt = 0, rt = 0;

        char[] chars = str.toCharArray();

        for (char aChar : chars) {

            int asccode = (int) aChar;

            if (asccode < 48 || asccode > 57) {

                rt = stack.pop();
                lt = stack.pop();

                if (aChar == '*') {
                    stack.push(lt * rt);
                } else if (aChar == '+') {
                    stack.push(lt + rt);
                } else if (aChar == '-') {
                    stack.push(lt - rt);
                }

            } else {
                int i = aChar - '0';
                stack.push(i);
            }

        }


        return stack.pop();
    }

}