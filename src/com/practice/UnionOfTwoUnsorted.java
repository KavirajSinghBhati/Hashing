package com.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfTwoUnsorted {
    public static void main(String[] args) {
        int[] a = {15, 20, 5, 15};
        int[] b = {15, 15, 15, 20, 10};
        int count = unionNaive(a, b, a.length, b.length);
        System.out.println(count);  //4
    }

    static int unionNaive(int[] a, int[] b, int m, int n) {
        ArrayList<Integer> dist = new ArrayList<>();
        int res = 0;
        for (int x : a) {
            boolean found = false;
            for (int y : dist) {
                if (x == y) {
                    found = true;
                    break;
                }
            }
            if (found)
                continue;
            dist.add(x);
            res++;
        }
        for (int x : b) {
            boolean found = false;
            for (int y : dist) {
                if (x == y) {
                    found = true;
                    break;
                }
            }
            if (found)
                continue;
            dist.add(x);
            res++;
        }
        return res;
    }
}
