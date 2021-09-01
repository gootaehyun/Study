import java.util.Scanner;

public class mineral {
    static char[][] map;
    static boolean[][] boolMap;
    static int R;
    static int C;
    static int bottomi = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        R = scan.nextInt();
        C = scan.nextInt();

        map = new char[R][C];
        boolMap = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            String s = scan.next();
            for (int j = 0; j < C; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        // for (int i = 0; i < R; i++) {
        // for (int j = 0; j < C; j++) {
        // System.out.print(map[i][j]);
        // }
        // System.out.println();
        // }

        int N = scan.nextInt();
        int[] Ntable = new int[N];
        for (int i = 0; i < N; i++) {
            Ntable[i] = scan.nextInt();
        }
        // 입력 끝

        int turn = 1;
        for (int i = 0; i < N; i++) {

            int[] breakPoint;
            breakPoint = stickThrowing(Ntable[i], turn); // 막대기 던지기

            if (clusterFind(breakPoint[0], breakPoint[1])) { // 떠있는거 있는지 찾기
                // for (int k = 0; k < R; k++) {
                // for (int j = 0; j < C; j++) {
                // System.out.print(boolMap[k][j] ? '0' : '1');
                // }
                // System.out.println();
                // }

            }

            clusterDown(); // 떠있는 클러스터 내리기

            turn *= -1; // 턴 체인지
        }
    }

    public static int[] stickThrowing(int tall, int turn) {
        int startPoint = 0;
        int[] breakPoint = new int[2];
        if (turn == -1) {
            startPoint = C - 1;
        }
        int height = R - tall;

        for (int i = startPoint; i >= 0 && i < R; i += turn) {
            if (map[height][i] == 'x') {
                map[height][i] = '.';
                breakPoint[0] = height;
                breakPoint[1] = i;
                break;
            }
        }
        return breakPoint;
    }

    public static boolean clusterFind(int bi, int bj) {
        if (bi - 1 != -1 && map[bi - 1][bj] == 'x') {
            boolMap = new boolean[R][C];
            dfs(bi - 1, bj);
            boolean isBottom = false;
            for (int j = 0; j < C; j++) {
                if (boolMap[R - 1][j]) {
                    isBottom = true;
                }
            }
            if (!isBottom) {
                return true;
            }
        }
        if (bj - 1 != -1 && map[bi][bj - 1] == 'x') {
            boolMap = new boolean[R][C];
            dfs(bi, bj - 1);
            boolean isBottom = false;
            for (int j = 0; j < C; j++) {
                if (boolMap[R - 1][j]) {
                    isBottom = true;
                }
            }
            if (!isBottom) {
                return true;
            }
        }
        if (bi + 1 != R && map[bi + 1][bj] == 'x') {
            boolMap = new boolean[R][C];
            dfs(bi + 1, bj);
            boolean isBottom = false;
            for (int j = 0; j < C; j++) {
                if (boolMap[R - 1][j]) {
                    isBottom = true;
                }
            }
            if (!isBottom) {
                return true;
            }
        }
        if (bj + 1 != R && map[bi][bj + 1] == 'x') {
            boolMap = new boolean[R][C];
            dfs(bi, bj + 1);
            boolean isBottom = false;
            for (int j = 0; j < C; j++) {
                if (boolMap[R - 1][j]) {
                    isBottom = true;
                }
            }
            if (!isBottom) {
                return true;
            }
        }
        return false;
    }

    public static void dfs(int i, int j) {
        boolMap[i][j] = true;
        if (i - 1 != -1 && map[i - 1][j] == 'x' && !boolMap[i - 1][j]) {
            dfs(i - 1, j);
        }
        if (j - 1 != -1 && map[i][j - 1] == 'x' && !boolMap[i][j - 1]) {
            dfs(i, j - 1);
        }
        if (i + 1 != R && map[i + 1][j] == 'x' && !boolMap[i + 1][j]) {
            if(bottomi < i)
            dfs(i + 1, j);
        }
        if (j + 1 != C && map[i][j + 1] == 'x' && !boolMap[i][j + 1]) {
            dfs(i, j + 1);
        }
    }

    public static void clusterDown() {
        //제일 밑에 있는거 찾기
        while (true) {
            for (int i = R - 1; i >= 0; i++) {
                for (int j = 0; j < C; j++) {
                    if(boolMap[i][j] && i + 1 < R && map[i+1][j] =='.'){

                    }
                }
            }
        }
    }
}
