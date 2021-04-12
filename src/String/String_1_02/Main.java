package String.String_1_02;


public class Main {

    public static void main(String[] args) {

        String string = "StuDY";

        Main main = new Main();
        String result = main.solution(string);
        System.out.println(result);
    }








    // 내가 풀어본거
    public String solution(String string) {


        StringBuilder stringBuilder = new StringBuilder();
        for (char c :  string.toCharArray()) {
            if (c >= 65 && c <= 90) {
                stringBuilder.append((char) (c + 32));
            } else if (c >= 97 && c <= 122) {
                stringBuilder.append((char) (c - 32));
            }
        }

        return stringBuilder.toString();
    }





}
