package leetcode_collection;

/**
 * MedianNumber class
 *
 * @author Soarkey
 * @date 2018/12/30
 */
public class MedianNumber {
    public static void main(String[] args) {

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      /*  int k = nums1.length + nums2.length;
        if (k % 2 == 1) {
            //奇数
            return divide(k / 2 + 1, nums1, nums2, nums1.length, nums2.length);
        } else {
            return divide(k, nums1, nums2, 0, nums2.length);
        }*/
        return -1;
    }

    /*public int divide(int k, int[] a, int[] b, int low, int high) {
        if (low > high) {
            return divide(k, a, b, high, low);
        }
        if (low == 0) {

        }

        if (low == a.length && high == 0) {
            // 同时走到底
            return a[low] + b[high] / 2;
        }
        if (high == 0) {
            // b走到底

        }
        if (a[low] >= b[high]) {
            if (m + n - low - high - 1 == mid) {
                return a[low];
            }
        }
        low = a.length - low / 2;
        high = high / 2;
        int m1 = a[low];
        int m2 = b[high];
        if (m1 >= m2) {

    }*/
}
