package String.String_1_11;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        //String str = "KKHSSSSSSSE";

        Main main = new Main();
        System.out.print(main.solution(str));
    }


    // 직접 풀어본...
    private String solution(String str) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        LinkedHashSet<Character> hashSet = new LinkedHashSet<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : str.toCharArray()) {
            hashSet.add(c);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);

        }

        for (Character character : hashSet) {
            Integer integer = hashMap.get(character);
            stringBuilder.append(character);
            if (integer != 1) stringBuilder.append(integer);
        }

        return stringBuilder.toString();
    }



    // 문제 풀이
    private String solution2(String str) {
        String answer = "";
        str = str + " ";

        int cnt = 1;
        for (int i = 0; i < str.length() -1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) cnt++;
            else {
                answer += str.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);

                cnt = 1;
            }
        }

        return answer;
    }

}
