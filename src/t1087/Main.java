package t1087;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.*;

/**
 * 1087 1 10 100 1000
 * 1 秒  131,072 KB
 * <p>
 * 1,10,100,1000...组成序列1101001000...，
 * 求这个序列的第N位是0还是1。
 *
 * @author Soarkey
 * @date 2018/12/30
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = in.nextInt();
        int temp;
        Map<Integer, Integer> map = calcOne();
        for (int i = 0; i < n; i++) {
            temp = in.nextInt();
            out.println(map.containsKey(temp) ? 1 : 0);
        }
        in.close();
        out.flush();
        out.close();

//        List<Integer> ks = new ArrayList<Integer>(map.keySet());
//        /*将list有序排列*/
//        Collections.sort(ks, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer arg0, Integer arg1) {
//                return arg0 - arg1; // 按照id排列
//            }
//        });
//        System.out.println(ks);

    }

    /**
     * 暴力打表
     */
    public static Map<Integer, Integer> calcOne() {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 1;
        int i = 1;
        map.put(i, 1);
        for (int j = 1; i < 10_0000_0000; j++) {
            sum += j;
            i = sum;
            map.put(i, 1);
        }
        return map;
    }
}
