package Yoon;

public class test {
    public static void main(String[] args) {
        int[][] map = { { 1, 0, 1, 1, 0, 0 }, { 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 1, 1 }, { 0, 0, 1, 1, 1, 1 } };

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(map[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
