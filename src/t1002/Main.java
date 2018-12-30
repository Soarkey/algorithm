package t1002;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * 1002 数塔取数问题
 * 一个高度为N的由正整数组成的三角形，从上走到下，求经过的数字和的最大值。
 * 每次只能走到下一层相邻的数上，例如从第3层的6向下走，只能走到第4层的2或9上。
 * 5
 * 8 4
 * 3 6 9
 * 7 2 9 5
 * 例子中的最优方案是：5 + 8 + 6 + 9 = 28
 *
 * @author Soarkey
 * @date 2018/12/28
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        // N为数塔的高度 (2 <= N <= 500)
        int n = in.nextInt();
        int count = n * (n + 1) / 2;
        int[] a = new int[count];
        int i, j, k;
        for (i = 0; i < count; i++) {
            a[i] = in.nextInt();
        }
        int[] b = new int[count];
        b[0] = a[0];
        for (i = 1; i < n; i++) {
            // 每一行的第一列
            k = i * (i + 1) / 2;
            b[k] = b[i * (i - 1) / 2] + a[k];
            // 每一行的最后一列
            k = i * (i + 1) / 2 + i;
            b[k] = b[i * (i - 1) / 2 + i - 1] + a[k];
        }
        for (i = 1; i < n; i++) {
            for (j = 1; j < i; j++) {
                // 填剩余空位
                k = i * (i + 1) / 2 + j;
                b[k] = Math.max(b[i * (i - 1) / 2 + j - 1], b[i * (i - 1) / 2 + j]) + a[k];
            }
        }
        int max = Integer.MIN_VALUE;
        for (i = count - 1; i >= count - n; i--) {
            // 查找最大值
            if (b[i] > max) {
                max = b[i];
            }
        }
        System.out.println(max);
    }

//    public static void print(int[] a, int n, String s) {
//        System.out.println(s);
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(a[i * (i + 1) / 2 + j] + "  ");
//            }
//            System.out.println();
//        }
//    }
}
