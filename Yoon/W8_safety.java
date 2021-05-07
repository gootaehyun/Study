package Yoon;

import java.util.Scanner;

public class W8_safety {
    static boolean[][] visited;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[][] map = new int[N][N];
        int min = 101;
        int max = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int tmp = sc.nextInt();
                if (min > tmp) {
                    min = tmp;
                }
                if (max < tmp) {
                    max = tmp;
                }
                map[i][j] = tmp;
            }
        }

        for (int t = min; t <= max; t++) {
            visited = new boolean[N][N];
            int count = 0;
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    if (map[i][j] <= t) {
                        visited[i][j] = true;
                    }
                }
            }
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    if (!visited[i][j]) {
                        visited[i][j] = true;
                        dfs(i, j);
                        count++;
                    }
                }
            }
            // System.out.println(t + " " + count);
            if (ans < count) {
                ans = count;
            }
        }
        System.out.println(ans);
    }

    static void dfs(int i, int j) {
        int[][] dir = { { 0, -1 }, { -1, 0 }, { 0, 1 }, { 1, 0 } };
        for (int k = 0; k < 4; k++) {
            int tmpI = i + dir[k][0];
            int tmpJ = j + dir[k][1];
            if (tmpI >= 0 && tmpJ >= 0 && tmpI < N && tmpJ < N) {
                if (!visited[tmpI][tmpJ]) {
                    visited[tmpI][tmpJ] = true;
                    dfs(tmpI, tmpJ);
                }
            }
        }
    }
}
