package HashMapAndTreeSet.Q_02;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
/*
        String a = in.next();
        String b = in.next();

*/

        String a = "AbaAeCe";
        String b = "baeeACA";

        Main main = new Main();
        System.out.println(main.solution(a, b));
    }

    // 내가 풀어본거
    public String solution(String s1, String s2) {

        String answer = "YES";
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        for (char c : chars1) {
            hashMap1.put(c, hashMap1.getOrDefault(c, 0) + 1);
        }

        for (char c : chars2) {
            hashMap2.put(c, hashMap2.getOrDefault(c, 0) + 1);
        }

        for (Character character : hashMap1.keySet()) {
            Integer integer1 = hashMap1.get(character);
            Integer integer2 = hashMap2.get(character);

            if (!integer1.equals(integer2)) {
                return "NO";
            }
        }

        return answer;
    }
}
