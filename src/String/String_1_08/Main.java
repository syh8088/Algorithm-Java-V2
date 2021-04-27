package String.String_1_08;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        //String str = "found7, time: study; Yduts; emit, 7Dnuof";

        Main main = new Main();
        System.out.println(main.solution(str));
    }











    private String solution(String str) {
        String answer = "YES";

        String s = str.toUpperCase().replaceAll("[^A-Z]", "");

        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return "NO";
            }
        }

        return answer;
    }
}
