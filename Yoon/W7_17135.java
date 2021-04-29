package Yoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class W7_17135 {
    static boolean[] dfsCom;
    static int max = 0;
    static int leftE = 0;
    static int N;
    static int M;
    static int D;
    static int[][] map;
    static int[][] OriginalMap;
    static int killCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        N = sc.nextInt();
        M = sc.nextInt();
        D = sc.nextInt();
        dfsCom = new boolean[M];
        map = new int[N][M];
        OriginalMap = new int[N][M];
        // 입력 완료
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) {
                    leftE++;
                }
                OriginalMap[i][j] = tmp;
            }
        }
        dfs(0, 3, 0);// 3명의 궁수를 조합으로 배치

        System.out.println(max);
    }

    static void dfs(int now, int depth, int i) {
        if (now == depth) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    map[n][m] = OriginalMap[n][m];
                }
            }
            simulate(); // 이후 시뮬레이션
            return;
        } else {
            for (; i < dfsCom.length; i++) {
                if (!dfsCom[i]) {
                    dfsCom[i] = true;
                    dfs(now + 1, depth, i + 1);
                    dfsCom[i] = false;
                }
            }
        }
    }

    static void simulate() {
        int en = 3;
        killCount = 0;
        for (int m = 0; m < N; m++) {
            int[][] enemy = new int[en][2]; // 세명의 적의 위치
            int ar = 0;
            for (int i = 0; i < dfsCom.length; i++) {
                if (dfsCom[i]) { // 해당위치에 궁수가 있으면
                    enemy[ar] = bfs(i); // 적의 위치 입력
                    ar++;
                }
            }
            for (int i = 0; i < en; i++) {
                if (enemy[i][0] == -1) {
                    continue;
                }
                if (map[enemy[i][0]][enemy[i][1]] == 1) {
                    map[enemy[i][0]][enemy[i][1]] = 0;
                    killCount++;
                }
            }
            boolean chk = enemyCome();
            if (!chk) {// 만약 false가 return되면 중지.
                
                break;
            }
        }
        if (max < killCount) {
            max = killCount;
        }
    }

    static int[] bfs(int x) {// 위치의 궁수로 적 공격, 공격받을 대상 위치 리턴 bfs
        int[] posi = new int[2];
        Queue<Integer> qi = new LinkedList<Integer>();
        Queue<Integer> qj = new LinkedList<Integer>();
        Queue<Integer> qd = new LinkedList<Integer>();
        qi.add(N - 1);
        qj.add(x);
        qd.add(1);
        boolean[][] visited = new boolean[N][M];
        while (!qi.isEmpty()) {
            int i = qi.poll();
            int j = qj.poll();
            int d = qd.poll();
            visited[i][j] = true;
            if (map[i][j] == 1) {
                posi[0] = i;
                posi[1] = j;
                return posi;
            }
            if (j - 1 >= 0 && !visited[i][j - 1] && d < D) {
                qi.add(i);
                qj.add(j - 1);
                qd.add(d+1);
            }
            if (i - 1 >= 0 && !visited[i - 1][j] && d < D) {
                qi.add(i - 1);
                qj.add(j);
                qd.add(d+1);
            }
            if (j + 1 < M && !visited[i][j + 1] && d < D) {
                qi.add(i);
                qj.add(j + 1);
                qd.add(d+1);
            }
            d++;
        }
        posi[0] = -1;
        posi[1] = -1; // 쏠게 없을떄 리턴
        return posi;
    }

    static boolean enemyCome() {
        for (int j = 0; j < M; j++) {
            if (map[N - 1][j] == 1) {
                return false;
            }
        }
        for (int i = N - 2; i >= 0; i--) {
            for (int j = M - 1; j >= 0; j--) {
                if (map[i][j] == 1) {
                    map[i][j]--;
                    map[i + 1][j]++;
                }
            }
        }
        return true;
    }
}
