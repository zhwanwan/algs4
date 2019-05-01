package zhwanwan.algs;

import java.util.Arrays;

/**
 * @author wangzhen
 * @create 2019-04-28 10:24 AM
 */
public class BinarySearch {

    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        //当low <= high--继续查找
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key > a[mid]) {
                low = mid + 1;
            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        //low > high--查找失败
        return -1;
    }

    /**
     * @param a    数组
     * @param key  被查找元素值
     * @param low  开始位置
     * @param high 结束位置
     * @return 查找元素的下标
     */
    public static int binarySearch(int[] a, int key, int low, int high) {
        if (low > high)
            return -1;
        int mid = low + (high - low) / 2;
        if (key < a[mid]) {
            return binarySearch(a, key, low, mid - 1);
        } else if (key > a[mid])
            return binarySearch(a, key, mid + 1, high);
        else {
            return mid;
        }

    }

    public static void main(String[] args) {
        int[] a = {9, 33, 4, 2, 56, 24, 22};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(binarySearch(a, 22));
        System.out.println(binarySearch(a, 22, 0, a.length - 1));
    }
}
