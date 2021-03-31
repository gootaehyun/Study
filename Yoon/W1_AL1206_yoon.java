package Yoon;

import java.util.Scanner;

public class W1_AL1206_yoon { //view
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = 10;
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int[] b = new int[N];
            for (int n = 0; n < N; n++) {
                b[n] = sc.nextInt();
            }

            int total = 0;

            for (int n = 2; n < N - 2; n++) {
                if (b[n - 2] < b[n] && b[n - 1] < b[n] && b[n + 1] < b[n] && b[n + 2] < b[n]) {
                    int max = 0;
                    for (int i = 0; i < 5; i++) {
                        if (i == 2) {
                            continue;
                        }
                        if (max < b[n - 2 + i]) {
                            max = b[n - 2 + i];
                        }
                    }
                    total += b[n] - max;
                } else {
                    continue;
                }

            }
            System.out.println("#" + t + " " + total);
        }
    }

}