package com.subarrayquestions;

import java.util.HashSet;

public class ZeroSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 13, -3, -10, 5};
        System.out.println(hashingAndPrefixSum(arr));
    }

    static boolean isZeroSubArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];
                if (currSum == 0)
                    return true;
            }
        }
        return false;
    }

    static boolean hashingAndPrefixSum(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int prefixSum = 0;
        for (int j : arr) {
            prefixSum += j;
            if (set.contains(prefixSum))
                return true;
            if (prefixSum == 0)
                return true;
            set.add(prefixSum);
        }
        return false;
    }
}
