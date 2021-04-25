package String.String_1_06;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //String str = in.next();
        String str = "ksekkset";

        Main main = new Main();
        System.out.println(main.solution(str));
    }






    // 내가 풀어본것.
    private String solution(String str) {

        HashSet<Character> hashSet = new HashSet<>();

        char[] chars = str.toCharArray();

        char[] result = new char[chars.length];

        int i = 0;
        for (char aChar : chars) {

            if (!hashSet.contains(aChar)) {
                result[i] = aChar;
                i++;
            }

            hashSet.add(aChar);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : result) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString().trim();
    }


    // 문제 풀이
    private String solution2(String str) {

        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }
}
