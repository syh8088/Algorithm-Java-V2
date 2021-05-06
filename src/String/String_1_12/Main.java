package String.String_1_12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        String input2 = in.next();

        //int input1 = 4;
        //String input2 = "#****###**#####**#####**##**";

        Main main = new Main();
        System.out.print(main.solution2(input1, input2));
    }


    // 직접 풀어본...
    private String solution(int input1, String input2) {

        char[] chars = input2.toCharArray();
        int length = chars.length;
        int[] ints = new int[length];
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder result = new StringBuilder();

        int i = 0;
        for (char c : chars) {
            if (c == '#') {
                ints[i] = 1;
                stringBuilder.append(1);
            } else if (c == '*') {
                ints[i] = 0;
                stringBuilder.append(0);
            }

            i++;

            if (i % 7 == 0) {
                int i1 = Integer.parseInt(stringBuilder.toString(), 2);
                stringBuilder.setLength(0);
                result.append((char) i1);
            }

        }
        return null;
    }


    // 풀이
    private String solution2(int input1, String input2) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < input1; i++) {
            String tmp = input2.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);

            answer.append((char) num);
            input2 = input2.substring(7);


        }

        return answer.toString();
    }

}
