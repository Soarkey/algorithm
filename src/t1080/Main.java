package t1080;

import java.util.Scanner;

/**
 * 1080 两个数的平方和
 * 1 秒  131,072 KB
 * 给出一个整数N，将N表示为2个整数i与j的平方之和（i <= j)，
 * 如果有多种表示，按照i的递增序输出。
 * <p>
 * 例如：N = 130，130 = 3^2 + 11^2 = 7^2 + 9^2
 * （注：3^2 + 11^2同11^2 + 3^2算1种）
 *
 * @author Soarkey
 * @date 2018/12/29
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean tag = false;
        int x = (int) Math.sqrt(n) + 1;
        int[] record = new int[x + 1];
        int i, j, k;
        for (i = 0; i <= x; i++) {
            for (j = x; j >= i; j--) {
                k = i * i + j * j;
                if (record[i] == 0 && k == n) {
                    System.out.println(i + " " + j);
                    tag = true;
                    record[i] = 1;
                }
            }
        }
        if (!tag) {
            System.out.println("No Solution");
        }
    }
}
