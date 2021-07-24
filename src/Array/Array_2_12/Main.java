package Array.Array_2_12;

public class Main {

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int[][] arr = new int[m][n];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = in.nextInt();
//            }
//        }


        int n = 4;
        int m = 3;
        int[][] arr = {
                { 3, 4, 1, 2 },
                { 4, 3, 2, 1 },
                { 3, 1, 4, 2 }
        };

        Main main = new Main();
        System.out.print(main.solution(n, m, arr));
    }

    // 내가 풀어본거
    public int solution(int n, int m, int[][] arr) {

        int answer = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                int cnt = 0;
                for (int k = 0; k < n; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }

                    if (pi < pj) cnt++;
                }

                if (cnt == m) {
                    answer++;
                }

            }
        }

        return answer;
    }
}
