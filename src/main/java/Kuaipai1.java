/**
 * Copyright (C), 2011-2018, 微贷网.
 */

/**
 * @author binglin 2018/3/17.
 */
public class Kuaipai1 {

    public static void main(String[] args) {
        int[] arr = {3, 12, 8, 4, 6, 2, 9, 2, 5};
        sort(arr, 0, arr.length - 1);
        System.out.println(arr);
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static int partition(int[] arr, int left, int right) {
        int x = arr[right];
        int index = left;
        for (int i = left; i < right; i++) {
            if (arr[i] < x) {
                swap(arr, index, i);
                index++;
            }
        }
        swap(arr, right, index);
        return index;
    }

    public static void sort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int index = partition(arr, left, right);
        sort(arr, left, index - 1);
        sort(arr, index + 1, right);
    }
}
