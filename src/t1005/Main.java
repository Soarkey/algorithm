package t1005;

import java.util.Scanner;

/**
 * 1015 水仙花数
 * 1 秒  131,072 KB
 * <p>
 * 水仙花数是指一个 n 位数 ( n >= 3 )，它的每个位上的数字的 n 次幂之和等于它本身。
 * （例如：1^3 + 5^3 + 3^3 = 153）
 * 给出一个整数M，求 >= M的最小的水仙花数。
 *
 * @author Soarkey
 * @date 2018/12/28
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        while (!judge(m)){
            m++;
        }
        System.out.println(m);
    }

    public static boolean judge(int num) {
        int x = num;
        //位数
        int k = (int) (Math.log10(num) + 1);
        int sum = 0;
        while (num > 0) {
            sum += Math.pow(num % 10, k);
            num /= 10;
        }
        return sum == x;
    }
}
