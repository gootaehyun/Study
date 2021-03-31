package Yoon;

import java.util.Scanner;

public class W2_AL1204_yoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            String ans = Integer.toString(i);
            int count = 0;
            for (char c : ans.toCharArray()) {
                if (c == '3' || c == '6' || c == '9') {
                    count++;
                }
            }
            if(count != 0){
                ans = "-";
                for (int j = 1; j < count; j++) {
                    ans += "-";
                }
            }
            System.out.print(ans + " ");
        }
    }
}