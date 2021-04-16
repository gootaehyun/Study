package Yoon;

import java.util.Scanner;

public class W5_2005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int[] pre = { 1 };
            int[] now;
            System.out.println("#" + t);
            for (int i = 1; i <= N; i++) {
                now = new int[i];
                for (int j = 0; j < i; j++) {
                    if (j == 0 || j == i - 1) {
                        now[j] = 1;
                    } else {
                        now[j] = pre[j - 1] + pre[j];
                    }
                    System.out.print(now[j] + " ");
                }
                System.out.println();
                pre = now;
            }

        }
    }
}
