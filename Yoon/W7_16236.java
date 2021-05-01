package Yoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class W7_16236 {
    public static void main(String[] args) {
        int[][] dim = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] map = new int[N][N];
        int si = 0;
        int sj = 0;
        int size = 2;
        int eatcount = size;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 9) {
                    si = i;
                    sj = j;
                    map[i][j]=0;
                }
            }
        }
        int count = 0;

        while (true) {
            int chk = count;
            Queue<ij> q = new LinkedList<ij>();
            boolean[][] visited = new boolean[N][N];
            q.offer(new ij(si, sj, 0));
            visited[si][sj] = true;
            // bfs
            while (!q.isEmpty()) {
                ij tmp = q.poll();
                int i = tmp.i;
                int j = tmp.j;
                int d = tmp.d;
                d++;
                for (int k = 0; k < dim.length; k++) {// 4방 탐색(4회 반복)
                    if (i + dim[k][0] >= 0 && i + dim[k][0] < N && j + dim[k][1] >= 0 && j + dim[k][1] < N) {
                        if (map[i + dim[k][0]][j + dim[k][1]] <= size && !visited[i + dim[k][0]][j + dim[k][1]]) {
                            if (map[i + dim[k][0]][j + dim[k][1]] == 0 || map[i + dim[k][0]][j + dim[k][1]] == size ) {
                                q.offer(new ij(i + dim[k][0], j + dim[k][1], d));
                                visited[i + dim[k][0]][j + dim[k][1]] = true;
                            } else { // 물고기 잡아먹기 실행
                                si = i + dim[k][0];
                                sj = j + dim[k][1];
                                System.out.println(si + " " + sj);
                                count += d;
                                System.out.println(count);
                                map[i + dim[k][0]][j + dim[k][1]] = 0;
                                q.clear();// while종료시키기
                                eatcount--;
                                if(eatcount == 0){
                                    size++;
                                    eatcount = size;
                                    System.out.println(size);
                                }
                                break;
                            }
                        }
                    }
                }
            }
            if (count == chk) { // 잡아먹지 못했다면
                break;
            }

        }
        System.out.println(count);

    }

    static class ij {
        int i;
        int j;
        int d;

        ij(int i, int j, int d) {
            this.i = i;
            this.j = j;
            this.d = d;
        }
    }
}
