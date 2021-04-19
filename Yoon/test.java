package Yoon;

public class test {
    public static void main(String[] args) {
        int[] ls = { 1, 2, 3, 4 };
        int p1 = 0;
        int p2 = 1;
        while (p2 < ls.length) {
            System.out.println(p1 + " " + p2);
            p2++;
            if (p2 == ls.length) {
                p1++;
                p2 = p1 + 1;
            }
            if (p2 == ls.length && p1 == ls.length) {
                break;
            }
        }
    }
}
