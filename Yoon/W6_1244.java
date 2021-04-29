package Yoon;
import java.util.Scanner;

public class W6_1244 {
    static int max = 0;
    static int[] ls;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int type = sc.nextInt();
            m = sc.nextInt();

            ls = new int[(int) Math.log10(type) + 1];
            for (int i = ls.length - 1; i >= 0; i--) {
                int k = type % 10;
                type /= 10;
                ls[i] = k;
            }
            max = 0;
            dfs(0, 0);
            System.out.println("#" + t + " " + max);

        }
    }

    static void dfs(int n, int now) {
        if (now == m) {
            int tmp = 0;
            int ten = 1;
            for (int i = ls.length - 1; i >= 0; i--) {
                tmp += ls[i] * ten;
                ten *= 10;
            }
            if (max < tmp) {
                max = tmp;
            }
            return;
        }
        for (int i = n; i < ls.length; i++) {
            for (int j = i + 1; j < ls.length; j++) {
                int tmp = ls[i];
                ls[i] = ls[j];
                ls[j] = tmp;
                dfs(i, now + 1);
                tmp = ls[i];
                ls[i] = ls[j];
                ls[j] = tmp;
            }
        }
    }
}
