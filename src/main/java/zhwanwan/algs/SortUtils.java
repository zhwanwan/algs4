package zhwanwan.algs;

import java.util.Arrays;

/**
 * @author wangzhen
 * @create 2019-04-29 11:00 PM
 */
public class SortUtils {

    private static int partition(int a[], int i, int j) {
        int key = a[i];
        while (i < j) {
            while (a[j] >= key && i < j) {
                j--;
            }
            if (i < j) { //***这个条件一定不能少
                a[i] = a[j];
                i++;
            }
            while (a[i] < key && i < j) {
                i++;
            }
            if (i < j) { ////***这个条件一定不能少
                a[j] = a[i];
                j--;
            }
        }
        a[i] = key;
        return i;
    }

    private static void quickSort(int arr[], int from, int to) {
        if (from < to) { //递归结束的条件
            //1.分区
            int base = partition(arr, from, to);
            //2.对左边进行排序
            quickSort(arr, from, base - 1);
            //3.对右边进行排序
            quickSort(arr, base + 1, to);
        }
    }

    public static void quickSort(int arr[]) {
        quickSort(arr, 0, arr.length - 1);
    }



    public static void main(String args[]) {
        int arr[] = {72, 6, 57, 88, 60, 42, 83, 43, 48, 85, 3, 5, 45, 32, 11, 2, 1, 99, 71};
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
