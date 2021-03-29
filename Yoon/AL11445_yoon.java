package Yoon;

import java.util.Scanner;

public class AL11445_yoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            char YN = 'Y';
            String P = sc.next();
            String Q = sc.next();
            if (Q.equals(P + "a")) {

                // Q == P 이거 안댐
                // Q.equals(P);
                // aaa 의 다음문자
                // aab x aaaa -> 이거임

                YN = 'N';
            }
            System.out.println("#" + t + " " + YN);
        }
    }
}