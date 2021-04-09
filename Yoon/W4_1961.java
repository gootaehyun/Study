package Yoon;

import java.util.Scanner;

public class W4_1961 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();

            int[][] num = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    num[i][j] = sc.nextInt();
                }
            }
            System.out.println("#" + t);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < num.length; j++) {
                    System.out.print(num[n-1-j][i]);
                }
                System.out.print(" ");
                for (int j = 0; j < num.length; j++) {
                    System.out.print(num[n-1-i][n-1-j]);
                }
                System.out.print(" ");
                for (int j = 0; j < num.length; j++) {
                    System.out.print(num[j][n-1-i]);
                }
                System.out.println();
            }
        }
    }
}
