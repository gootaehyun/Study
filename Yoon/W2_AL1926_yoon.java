package Yoon;

import java.util.Scanner;

public class W2_AL1926_yoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int[] count = new int[101];
            t = sc.nextInt();
            int score = 0;
            for (int i = 0; i < 1000; i++) {
                score = sc.nextInt();
                count[score]++;
            }
            int max = 0;
            int idx = 0;
            for (int i = 0; i < count.length; i++) {
                if (count[i] >= max) {
                    max = count[i];
                    idx = i;
                }
            }
            System.out.println("#" + t + " " + idx);
        }
    }
}