package com.practice;

public class IntersectionOfTwoUnsorted {
    public static void main(String[] args) {
        int[] a = {10, 15, 20, 5, 30};
        int[] b = {30, 5, 30, 80};
        int count = intersectionNaive(a, b, a.length, b.length);
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
}
