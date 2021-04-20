package Yoon;

import java.util.Scanner;

public class W6_1208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = 10;
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int[] boxes = new int[100];
            for (int i = 0; i < boxes.length; i++) {
                boxes[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                int max = 0;
                int min = 100;
                int maxI = 0;
                int minI = 0;
                for (int j = 0; j < boxes.length; j++) {
                    if (max < boxes[j]) {
                        max = boxes[j];
                        maxI = j;
                    }
                    if (min > boxes[j]) {
                        min = boxes[j];
                        minI = j;
                    }
                }
                boxes[maxI]--;
                boxes[minI]++;
            }
            int max = 0;
            int min = 100;
            for (int j = 0; j < 100; j++) {
                if (max < boxes[j]) {
                    max = boxes[j];
                }
                if (min > boxes[j]) {
                    min = boxes[j];
                }
            }
            int ans = max - min;
            System.out.println("#" + t + " " + ans);
        }
    }
}
