package t1082;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 1082 与7无关的数
 * 1 秒  131,072 KB
 * <p>
 * 一个正整数，如果它能被7整除，或者它的十进制表示法中某个位数上的数字为7，
 * 则称其为与7相关的数。求所有小于等于N的与7无关的正整数的平方和。
 * <p>
 * 例如：N = 8，<= 8与7无关的数包括：1 2 3 4 5 6 8，平方和为：155。
 *
 * @author Soarkey
 * @date 2018/12/29
 */
public class Main {
    static int max = 100_0000;
    static long[] record = new long[max];

 /*   public static void main(String[] args) {
        pre();
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = in.nextInt();
        int temp;
        for (int i = 0; i < n; i++) {
            temp = in.nextInt();
            out.println(record[temp]);
            out.flush();
        }
        in.close();
        out.close();
    }

    *//**
     * 暴力打表
     * 预处理所有小于等于N的与7无关的正整数的平方和
     *//*
    public static void pre() {
        BigInteger sum = BigInteger.ZERO;
        BigInteger bmax = BigInteger.valueOf(max);
        for (BigInteger i = BigInteger.ONE; i.compareTo(bmax) <= 0; i.add(BigInteger.ONE)) {
            if (!judge(i)) {
                sum.add(i) += i.pow(BigInteger.valueOf("2"));
            }
            record[(Integer) Long.valueOf(i.toString())] = sum;
        }
    }

    *//**
     * 判断是否与7有关
     *//*
    public static boolean judge(BigInteger n) {
        if (n % 7 == 0) {
            return true;
        }
        while (n > 0) {
            if (n % 7 == 0) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }*/
}
