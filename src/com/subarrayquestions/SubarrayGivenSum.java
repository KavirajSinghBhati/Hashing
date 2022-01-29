package com.subarrayquestions;

import java.util.HashSet;

public class SubarrayGivenSum {
    public static void main(String[] args) {
        int[] arr = {5, 8, 6, 13, 3, -1};
        System.out.println(givenSumNaive(arr, 22));
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
}
