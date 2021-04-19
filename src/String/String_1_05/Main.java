package String.String_1_05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        Main main = new Main();
        System.out.println(main.solution(str));
    }


    private String solution(String str) {

        String answer;

        int length = str.length();

        int lt = 0;
        int rt = length - 1;

        char[] chars = str.toCharArray();

        while (lt < rt) {

            char ltChar = chars[lt];
            char rtChar = chars[rt];

            if (!Character.isAlphabetic(ltChar)) {
                lt++;
            } else if (!Character.isAlphabetic(rtChar)) {
                rt--;
            } else {
                chars[rt] = chars[lt];
                chars[lt] = rtChar;

                lt++;
                rt--;
            }
        }
        answer = String.valueOf(chars);

        return answer;
    }


}
