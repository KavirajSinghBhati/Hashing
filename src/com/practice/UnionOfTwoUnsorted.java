package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoUnsorted {
    public static void main(String[] args) {
        int[] a = {15, 20, 5, 15};
        int[] b = {15, 15, 15, 20, 10};
        int count = unionEfficient(a, b);
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

    static int unionEfficient(int[] a, int[] b) {
        HashSet<Integer> hash = new HashSet<>();
        for (int x : a)
            hash.add(x);
        for (int y : b)
            hash.add(y);
        return hash.size();
    }
}
