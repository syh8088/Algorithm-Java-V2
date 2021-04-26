package String.String_1_07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        //String str = "gozoG";

        Main main = new Main();
        System.out.println(main.solution2(str));
    }

    // 내가 풀어본것. (틀린거......)
    private String solution1(String str) {
        String answer = "YES";

        int length = str.length();
        int calculation = length - 1;

        for (int i = 0; i < length / 2; i++) {
            char c = str.charAt(i);
            char lc = str.charAt(calculation + i);
            calculation = calculation / 2;

            String s = String.valueOf(c).toUpperCase();
            String s1 = String.valueOf(lc).toUpperCase();

            if (!s.equals(s1)) return "NO";
        }

        return answer;
    }

    // 풀이
    private String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1)) return "NO";
        }

        return answer;
    }

    // 풀이2
    private String solution2(String str) {
        String answer = "NO";
        String tmp = new StringBuffer(str).reverse().toString();

        if (str.equalsIgnoreCase(tmp)) answer = "YES";

        return answer;
    }


}
