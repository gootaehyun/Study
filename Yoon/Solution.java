package Yoon;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            char YN = 'Y';
            String P = sc.next();
            String Q = sc.next();
            if (Q.equals(P + "a")) {
                YN = 'N';
            }
            System.out.println("#" + t + " " + YN);
        }
    }
}