package String.String_1_09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
      //  String str = "g0en2T0s8eSoft";

        Main main = new Main();
        System.out.println(main.solution(str));
    }










    // 내가 푼거.... 틀린거??....
    private int solution2(String str) {

        boolean start = true;
        char[] chars = str.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : chars) {
            int i1 = aChar - '0';

            if (i1 <= 9) {
                if (start && i1 == 0) {
                    start = false;
                } else {
                    stringBuilder.append(i1);
                }

            }

        }

        return Integer.valueOf(stringBuilder.toString());
    }


    // 풀이
    private int solution(String str) {

        int answer = 0;
        for (char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }
        }

        return answer;
    }
}
