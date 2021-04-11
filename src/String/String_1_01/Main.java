package String.String_1_01;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);

        Main main = new Main();
        int answer = main.solution(str, c);
        System.out.println(answer);
    }


    // 내가 풀어본거
    public int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        Map<Character, Integer> map = new HashMap<>();
        for (char c1 : str.toCharArray()) {
            map.put(c1, map.getOrDefault(c1, 0) + 1);
        }

        return map.get(c);
    }



}
