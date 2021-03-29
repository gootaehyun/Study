package Yoon;

import java.util.Scanner;

public class AL1954_yoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int[][] dirArr = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
            int dir = 0;

            int N = sc.nextInt();
            int[][] snail = new int[N][N];
            int i = 0;
            int j = 0;

            int Limit = N * N;
            int count = 1;
            while (count <= Limit) {

                if (i >= 0 && i < N && j >= 0 && j < N && snail[i][j] == 0) {
                    snail[i][j] = count;
                    count++;
                } else {
                    i -= dirArr[dir][0];
                    j -= dirArr[dir][1];
                    dir = (dir + 1) % 4;
                }
                i += dirArr[dir][0];
                j += dirArr[dir][1];
            }
            System.out.println("#" + t);
            for (int k1 = 0; k1 < snail.length; k1++) {
                for (int k2 = 0; k2 < snail.length; k2++) {
                    System.out.print(snail[k1][k2] + " ");
                }
                System.out.println();
            }
        }
    }
}