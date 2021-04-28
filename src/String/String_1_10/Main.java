package String.String_1_10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       String s = in.next();
       char t = in.next().charAt(0);
       // String s = "teachermode";
       // char t = 'e';

        Main main = new Main();
        for (int i : main.solution(s, t)) {
            System.out.print(i + " ");
        }
    }






    //
    private int[] solution(String s, char t) {

        int[] answer = new int[s.length()];
        int p = 1000;

        int i = 0;
        for (char c : s.toCharArray()) {
            if (c == t) {
                answer[i] = 0;
                p = 1;
            } else {
                answer[i] = p;
                p++;
            }
            i++;
        }

        for (int e = answer.length - 1; e >= 0 ; e--) {

            char c = s.charAt(e);
            if (c == t) {
                answer[e] = 0;
                p = 1;
            } else {
                answer[e] = (answer[e] > p) ? p : answer[e];
                p++;
            }

        }

        return answer;
    }
}
