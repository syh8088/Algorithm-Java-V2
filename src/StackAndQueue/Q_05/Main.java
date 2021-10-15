package StackAndQueue.Q_05;

import java.util.*;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


       // String str = in.next();


        String str = "()(((()())(())()))(())";

        Main main = new Main();
        System.out.print(main.solution(str));
    }

    /**
     * 문자의 영문,숫자,한글 여부를 리턴한다
     *
     * @param
     * @return
     */
    public static boolean checkSpecialCharacter(char asciiVal) {

        // 32값은 공백(Space) 이다.
        return (asciiVal > 32 && asciiVal <= 47) || (asciiVal >= 58 && asciiVal <= 64)
                || (asciiVal >= 91 && asciiVal <= 96) || (asciiVal >= 123 && asciiVal <= 126);
    }

    // 내가 풀어본거
    public int solution(String str) {

        String name = "서양훈[우리집]";
        int lt = 0, rt = 0;
        boolean working = false;
        List<List<Integer>> removeList = new ArrayList<>();

        char[] chars = name.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length; i++) {

            char aChar = chars[i];
            boolean type = checkSpecialCharacter(aChar);
            System.out.println("type = " + type);

            if (!working && type) {

                working = true;
                lt = rt = i;
            }  else if (working && (i == length - 1) && !type) {

                rt = i;
                List<Integer> integers = Arrays.asList(lt, rt);
                removeList.add(integers);
            } else if (working && !type) {

                rt = i;
            } else if (working && type) {
                working = false;

                rt = i;
                List<Integer> integers = Arrays.asList(lt, rt);
                removeList.add(integers);

                lt = rt = 0;
            }
        }

        System.out.println("removeList = " + removeList);

        int stringIndexStart = 0;
        for (List<Integer> integers : removeList) {
           // name = name.substring(integers.get(0) - stringIndexStart, integers.get(1) - stringIndexStart);

            String substring = name.substring(integers.get(0) - stringIndexStart, integers.get(1) + 1 - stringIndexStart);
            name = name.replace(substring, "");
            stringIndexStart = integers.get(1) - integers.get(0) + 1;
        }

        System.out.println("name = " + name);



        int answer = 0;
        Stack<Character> stack = new Stack<>();

        char preC = 0;

        for (char c : str.toCharArray()) {

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {

                if (preC == ')') {

                    stack.pop();
                    answer += 1;

                } else { // 레이저
                    stack.pop();
                    answer += stack.size();
                }


            }


            preC = c;

        }


        return answer;
    }

}