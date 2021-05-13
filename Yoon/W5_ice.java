import java.util.Scanner;

public class W5_ice {
    static char[][] ice;
    static int count = 0;
    static int N;
    static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        ice = new char[N][M];
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            char[] c = s.toCharArray();
            for (int j = 0; j < M; j++) {
                ice[i][j] = c[j];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (ice[i][j] == '0') {
                    count++;
                    dfs(i, j);
                }
            }
        }
        System.out.println(count);
    }

    static void dfs(int n, int m) {
        if (n < 0 || m < 0 || n == N || m == M || ice[n][m] == '1') {
            return;
        }
        ice[n][m] = '1';
        dfs(n + 1, m);
        dfs(n - 1, m);
        dfs(n, m + 1);
        dfs(n, m - 1);
    }
}
