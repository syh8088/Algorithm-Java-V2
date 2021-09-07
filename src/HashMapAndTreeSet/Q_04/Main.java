package HashMapAndTreeSet.Q_04;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
/*
        String a = in.next();
        String b = in.next();

*/

        String a = "bacaAacba";
        String b = "abc";

        Main main = new Main();
        System.out.println(main.solution(a, b));
    }

    // 내가 풀어본거
    public int solution(String a, String b) {

        int answer = 0;

        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        return answer;
    }
}
