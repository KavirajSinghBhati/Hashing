package com.subarrayquestions;

public class LongestSubarraySum {
    public static void main(String[] args) {
        int[] arr = {3, 1, 0, 1, 8, 2, 3, 6};
        System.out.println(longestSubarrayNaive(arr, 5));
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
}
