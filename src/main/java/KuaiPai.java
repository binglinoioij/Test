/**
 * Copyright (C), 2011-2018, 微贷网.
 */

import java.util.Arrays;
import java.util.Collections;

/**
 * @author binglin 2018/3/17.
 */
public class KuaiPai {

    public static int partition(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int x = arr[left];
        while (i < j) {
            // 从右向左找小于x的数来填s[i]
            while (i < j && arr[j] >= x) {
                j--;
            }
            if(i < j)
            {
                arr[i] = arr[j]; //将s[j]填到s[i]中，s[j]就形成了一个新的坑
                i++;
            }
            while (i < j && arr[i] < x) {
                i++;
            }
            if(i < j)
            {
                arr[j] = arr[i]; //将s[j]填到s[i]中，s[j]就形成了一个新的坑
                j--;
            }
        }
        arr[i] = x;
        return i;
    }

    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int partition=partition(arr, left, right);
            sort(arr, 0, partition - 1);
            sort(arr, partition+1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 12, 8, 4, 6, 2, 9, 2, 5};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }


}
