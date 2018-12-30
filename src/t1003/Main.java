package t1003;

import java.util.Scanner;

/**
 * 1003 阶乘后面0的数量
 * <p>
 * n的阶乘后面有多少个0？
 * 6的阶乘 = 1*2*3*4*5*6 = 720，720后面有1个0。
 * N(1 <= N <= 10^9)
 *
 * @author Soarkey
 * @date 2018/12/28
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 0;
        // 找出5的倍数，每个5都可以产生一个0
        while (n / 5 >= 1) {
            k += n / 5;
            n /= 5;
        }
        System.out.println(k);
    }
}
