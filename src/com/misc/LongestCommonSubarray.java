package com.misc;

import java.util.HashMap;

public class LongestCommonSubarray {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 0, 0, 0};
        int[] arr2 = {1, 0, 1, 0, 0, 1};
        System.out.println(maxCommonEfficient(arr1, arr2));
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

    static int maxCommonEfficient(int[] a, int[] b) {
        // computing a difference array
        int n = a.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = a[i] - b[i];
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0, maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += temp[i];
            if (sum == 0) // To handle sum=0 at last index
                maxLen = i + 1;
            if (map.containsKey(sum))
                maxLen = Math.max(maxLen, i - map.get(sum));
            else
                map.put(sum, i);
        }
        return maxLen;
    }
}
