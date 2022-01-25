package com.practice;

import java.util.HashSet;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {8, 3, 9, 4};
        System.out.println(isPairEfficient(arr, 13));
    }
    static boolean isPairNaive(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] + arr[j] == sum)
                    return true;
        return false;
    }
    static boolean isPairEfficient(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr)
            if (set.contains(sum - x))
                return true;
            else
                set.add(x);
        return false;
    }
 }
