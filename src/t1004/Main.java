package t1004;

import java.util.Scanner;

/**
 * 1004 n^n的末位数字
 * <p>
 * 给出一个整数N，输出N^N（N的N次方）的十进制表示的末位数字。
 *
 * @author Soarkey
 * @date 2018/12/28
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(last(n, n));

    }

    /**
     * 取a ^ b的末尾数字
     *
     * @param a a
     * @param b b
     * @return a ^ b的末尾数字
     */
    public static int last(int a, int b) {
        if (a / 10 > 1) {
            return last(a % 10, b) % 10;
        }
        if (b == 1) {
            return a;
        } else {
            int k = a * a % 10;
            if (b % 2 == 0) {
                // 偶数
                return last(k, b / 2);
            } else {
                return a * last(k, b / 2);
            }
        }
    }
}
