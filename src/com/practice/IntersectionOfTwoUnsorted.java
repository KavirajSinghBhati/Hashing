package com.practice;

import java.util.HashSet;

public class IntersectionOfTwoUnsorted {
    public static void main(String[] args) {
        int[] a = {10, 20, 10, 30, 20};
        int[] b = {20, 10, 10, 40};
        int count = intersectionEfficientOne(a, b);
        System.out.println(count);  // 2
    }

    static int intersectionNaive(int[] a, int[] b, int m, int n) {
        int res = 0;
        for (int i = 0; i < m; i++) {
            boolean isAlreadyAppeared = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isAlreadyAppeared = true;
                    break;
                }
            }
            if (isAlreadyAppeared)
                continue;
            for (int j = 0; j < n; j++) {
                if (a[i] == b[j]) {
                    res++;
                    break;
                }
            }
        }
        return res;
    }

    static int intersectionEfficientOne(int[] a, int[] b) {
        int res = 0;
        HashSet<Integer> hashOne = new HashSet<>();
        HashSet<Integer> hashTwo = new HashSet<>();
        for (int x : a)
            hashOne.add(x);
        for (int y : b)
            hashTwo.add(y);
        for (Integer x : hashOne)
            if (hashTwo.contains(x))
                res++;
        return res;
    }
}
