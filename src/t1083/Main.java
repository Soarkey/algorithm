package t1083;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * 1083 矩阵取数问题
 * 1 秒  131,072 KB
 * 一个N*N矩阵中有不同的正整数，经过这个格子，
 * 就能获得相应价值的奖励，从左上走到右下，
 * 只能向下向右走，求能够获得的最大价值。
 *
 * 例如：3 * 3的方格。
 *      1 3 3
 *      2 1 3
 *      2 2 1
 * 能够获得的最大价值为：11。
 *
 * @author Soarkey
 * @date 2018/12/30
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        in.close();
        int[][] b = new int[n][n];
        b[0][0] = a[0][0];
        for (int i = 1; i < n; i++) {
            b[i][0] = a[i][0] + b[i - 1][0];
            b[0][i] = a[0][i] + b[0][i - 1];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                b[i][j] = Math.max(b[i][j - 1], b[i - 1][j]) + a[i][j];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (max < b[n - 1][i]) {
                max = b[n - 1][i];
            }
        }
        System.out.println(max);
    }

}
