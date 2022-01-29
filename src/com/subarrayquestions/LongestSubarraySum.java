package com.subarrayquestions;

import java.util.HashMap;

public class LongestSubarraySum {
    public static void main(String[] args) {
        int[] arr = {3, 1, 0, 1, 8, 2, 3, 6};
        System.out.println(longestSubarrayEfficient(arr, 5));
    }

    static int longestSubarrayNaive(int[] arr, int sum) {
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];
                if (currSum == sum)
                    maxLength = Math.max(maxLength, j - i + 1);
            }
        }
        return maxLength;
    }

    static int longestSubarrayEfficient(int[] arr, int sum) {
        int preSum = 0, res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if (preSum == sum)
                res = i + 1;
            if (!map.containsKey(preSum))
                map.put(preSum, i);
            if (map.containsKey(preSum - sum))
                res = Math.max(res, i - map.get(preSum - sum));
        }
        return res;
    }
}
