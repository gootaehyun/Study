package Yoon;

import java.util.Scanner;

public class W5_11315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for (int t = 1; t <= T; t++) {

            int N = sc.nextInt();
            char[][] map = new char[N][N];
            for (int i = 0; i < N; i++) {
                String s = sc.next();
                char[] c = s.toCharArray();
                for (int j = 0; j < N; j++) {
                    map[i][j] = c[j];
                }
            }

            // 가로
            boolean success = false;
            for (int i = 0; i < N; i++) {
                if (success) {
                    break;
                }
                for (int j = 0; j < N; j++) {
                    if (map[i][j] == 'o') {
                        if (j + 1 < N && map[i][j + 1] == 'o') {
                            if (j + 2 < N && map[i][j + 2] == 'o') {
                                if (j + 3 < N && map[i][j + 3] == 'o') {
                                    if (j + 4 < N && map[i][j + 4] == 'o') {
                                        success = true;
                                    }
                                }
                            }
                        }
                        if (i + 1 < N && map[i + 1][j] == 'o') {
                            if (i + 2 < N && map[i + 2][j] == 'o') {
                                if (i + 3 < N && map[i + 3][j] == 'o') {
                                    if (i + 4 < N && map[i + 4][j] == 'o') {
                                        success = true;
                                    }
                                }
                            }
                        }
                        if (j + 1 < N && i + 1 < N && map[i + 1][j + 1] == 'o') {
                            if (j + 2 < N && i + 2 < N && map[i + 2][j + 2] == 'o') {
                                if (j + 3 < N && i + 3 < N && map[i + 3][j + 3] == 'o') {
                                    if (j + 4 < N && i + 4 < N && map[i + 4][j + 4] == 'o') {
                                        success = true;
                                    }
                                }
                            }
                        }
                        if (j + 1 < N && i - 1 >= 0 && map[i - 1][j + 1] == 'o') {
                            if (j + 2 < N && i - 2 >= 0 && map[i - 2][j + 2] == 'o') {
                                if (j + 3 < N && i - 3 >= 0 && map[i - 3][j + 3] == 'o') {
                                    if (j + 4 < N && i - 4 >= 0 && map[i - 4][j + 4] == 'o') {
                                        success = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.print("#" + t + " ");
            if (success) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
