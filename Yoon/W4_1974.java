package Yoon;

import java.util.Scanner;

public class W4_1974 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = 9;
            int ans = 1;
            int[][] map = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            boolean[] checks = new boolean[9];
            boolean flag = false;

            // 가로체크
            for (int i = 0; i < 9; i++) {
                checks = new boolean[9];
                for (int j = 0; j < 9; j++) {

                    if (!checks[map[i][j] - 1]) {
                        checks[map[i][j] - 1] = true;
                    } else {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            // 세로체크
            if (!flag) {
                for (int i = 0; i < 9; i++) {
                    checks = new boolean[9];
                    for (int j = 0; j < 9; j++) {
                        if (!checks[map[j][i] - 1]) {
                            checks[map[j][i] - 1] = true;
                        } else {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
                // 9칸 체크
                for (int i = 0; i < 9; i += 3) {
                    for (int j = 0; j < 9; j += 3) {
                        checks = new boolean[9];
                        for (int i2 = 0; i2 < 3; i2++) {
                            for (int j2 = 0; j2 < 3; j2++) {
                                if (!checks[map[i + i2][j + j2] - 1]) {
                                    checks[map[i + i2][j + j2] - 1] = true;
                                } else {
                                    flag = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
            }
            if (flag) {
                ans = 0;
            }
            System.out.println("#" + t + " " + ans);

        }
    }
}
