package t1090;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.*;

/**
 * Main class
 *
 * @author Soarkey
 * @date 2018/12/31
 */
public class Main {
    private static int[] number = new int[3];
    private static int[] visited, a;
    private static int n;
    private static Map map = new HashMap<Set<Integer>, Integer>();
    private static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));

        n = in.nextInt();
        visited = new int[n];
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

    }

    public static void solve() {
        for (int i = 0; i < n; i++) {

        }
    }


//    public static void dfs(int depth) {
//        if (depth == 3) {
//            if (number[0] + number[1] + number[2] == 0) {
//                out.println(number[0] + " "
//                        + number[1] + " " + number[2]);
//            }
//            return;
//        }
//        for (int i = 0; i < n; i++) {
//            if (visited[i] != 1) {
//                visited[i] = 1;
//                number[depth] = a[i];
//                dfs(depth + 1);
//                visited[i] = 0;
//            }
//        }
//
//    }
}
