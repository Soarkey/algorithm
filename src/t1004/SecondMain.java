package t1004;

import java.util.Scanner;

/**
 * 通过找规律来解
 * https://blog.csdn.net/queuelovestack/article/details/52331847
 *
 * @author Soarkey
 * @date 2018/12/28
 */
public class SecondMain {

    public static void main(String[] args) {
        //规律表
        int[][] s = {
                {0, 0, 0, 0},
                {1, 1, 1, 1},
                {2, 4, 8, 6},
                {3, 9, 7, 1},
                {4, 6, 4, 6},
                {5, 5, 5, 5},
                {6, 6, 6, 6},
                {7, 9, 3, 1},
                {8, 4, 2, 6},
                {9, 1, 9, 1}
        };
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(s[n % 10][(n - 1) % 4]);
    }
}
