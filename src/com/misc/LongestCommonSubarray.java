package com.misc;

public class LongestCommonSubarray {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 0, 0, 0};
        int[] arr2 = {1, 0, 1, 0, 0, 1};
        System.out.println(maxCommonNaive(arr1, arr2));
    }
    static int maxCommonNaive(int[] a, int[] b) {
        int n = a.length; //assuming both have same size
        int res = 0;
        for (int i = 0; i < n; i++) {
            int sum1 = 0, sum2 = 0;
            for (int j = i; j < n; j++) {
                sum1 += a[j];
                sum2 += b[j];
                if (sum1 == sum2)
                    res = Math.max(res, j - i + 1);
            }
        }
        return res;
    }
}
