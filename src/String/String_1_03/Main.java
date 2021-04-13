package String.String_1_03;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
       // String string = "it is time to study";

        Main main = new Main();
        String result = main.solution(string);
        System.out.println(result);
    }

    // 내가 풀어본거
    public String solution(String string) {
        String[] s = string.split(" ");
        Arrays.sort(s, Comp);
        return s[0];
    }

    Comparator<String> Comp = new Comparator<String>() {
        @Override
        public int compare(String a, String b) {
            // TODO Auto-generated method stub
            return b.length() - a.length();
        }
    };


}
