package String.String_1_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stringCount = in.nextInt();
        String[] str = new String[stringCount];

        for (int i = 0; i < stringCount; i++) {
            str[i] = in.next();
        }

        Main main = new Main();

        for (String x : main.solution(stringCount, str)) {
            System.out.println("x = " + x);
        }
    }


    private ArrayList<String> solution1(int stringCount, String[] str) {



        











        return null;
    }
















    // 해답
    private ArrayList<String> solution(int stringCount, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

       /* for (String x : str) {
            String tmp = new StringBuffer(x).reverse().toString();
            answer.add(tmp);
        }*/

       for (String x : str) {
           char[] chars = x.toCharArray();

           int lt = 0, rt = x.length() -1;

           while (lt < rt) {
               char tmp = chars[lt];

               chars[lt] = chars[rt];
               chars[rt] = tmp;

               lt++;
               rt++;
           }

           String tmp = String.valueOf(chars);
           answer.add(tmp);
       }

        return answer;
    };


}
