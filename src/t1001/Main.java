package t1001;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1001 数组中和等于K的数对
 * <p>
 * 给出一个整数K和一个无序数组A，
 * A的元素为N个互不相同的整数，
 * 找出数组A中所有和等于K的数对。
 * 例如K = 8，数组A：{-1,6,5,3,4,2,9,0,8}，
 * 所有和等于8的数对包括(-1,9)，(0,8)，(2,6)，(3,5)。
 *
 * @author Soarkey
 * @date 2018/12/28
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int i = 0;
        int[] a = new int[n];
        while (i != n) {
            a[i] = in.nextInt();
            ++i;
        }
        Arrays.sort(a);
        int p = 0, q = n - 1;
        int sum;
        boolean flag = false;
        while (p < q) {
            sum = a[p] + a[q];
            if (sum == k) {
                System.out.println(a[p] + " " + a[q]);
                ++p;
                --q;
                flag = true;
            } else if (sum > k) {
                --q;
            } else {
                ++p;
            }
        }
        if (!flag) {
            System.out.println("No Solution");
        }
    }
}
