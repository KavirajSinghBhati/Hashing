package com.subarrayquestions;

import java.util.HashSet;

public class SubarrayGivenSum {
    public static void main(String[] args) {
        int[] arr = {5, 8, 6, 13, 3, -1};
        System.out.println(givenSumEfficient(arr, 22));
    }

    static boolean givenSumNaive(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];
                if (currSum == sum)
                    return true;
            }
        }
        return false;
    }

    static boolean givenSumEfficient(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();
        int preSum = 0;
        for (int x : arr) {
            preSum += x;
            if (set.contains(preSum - sum))
                return true;
            if (preSum == sum)
                return true;
            set.add(preSum);
        }
        return false;
    }
}
