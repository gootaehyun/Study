package Yoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class W8_tomato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] tom = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                tom[i][j] = sc.nextInt();
            }
        }

        Queue<Integer> qi = new LinkedList<Integer>();
        Queue<Integer> qj = new LinkedList<Integer>();
        Queue<Integer> qt = new LinkedList<Integer>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tom[i][j] == 1) {
                    qi.offer(i);
                    qj.offer(j);
                    qt.offer(1);
                }
            }
        }
        int[][] dir = { { 0, -1 }, { -1, 0 }, { 0, 1 }, { 1, 0 } };
        while (!qi.isEmpty()) {
            int i = qi.poll();
            int j = qj.poll();
            int time = qt.poll();
            for (int k = 0; k < 4; k++) {
                int tmpI = i + dir[k][0];
                int tmpJ = j + dir[k][1];
                if (tmpI >= 0 && tmpJ >= 0 && tmpI < N && tmpJ < M) {
                    if (tom[tmpI][tmpJ] == 0) {
                        tom[tmpI][tmpJ] = time + 1;
                        qi.offer(tmpI);
                        qj.offer(tmpJ);
                        qt.offer(time + 1);
                    }
                }
            }
        }
        boolean zero = false;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tom[i][j] == 0) {
                    zero = true;
                    break;
                } else if (tom[i][j] > ans) {
                    ans = tom[i][j];
                }
            }
            if (zero) {
                break;
            }
        }
        if (zero) {
            ans = 0;
        } else {
            ans = ans - 1;
        }
        System.out.println(ans);
    }
}
