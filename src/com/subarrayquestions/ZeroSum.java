package com.subarrayquestions;

public class ZeroSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 13, -3, -10, 5};
        System.out.println(isZeroSubArray(arr));
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
}
