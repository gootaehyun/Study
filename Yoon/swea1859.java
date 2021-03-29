import java.util.Scanner;

public class swea1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            long total = 0;
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            N--;

            int max = 0;
            boolean flag = false;

            for (; N >= 0; N--) {
                if (max < arr[N]) {
                    max = arr[N];
                    flag = true;
                }
                if(!flag){
                    total += max - arr[N];
                }else{
                    flag = false;
                }
            }

            System.out.println("#" + t + " " + total);
        }
    }

}
