package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] arr = {15, 12, 13, 12, 13, 13, 18};
        int count = distinctEfficient(arr, arr.length);
        System.out.println(count);
    }
    static int distinctNaive(int[] arr, int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            boolean flag = false; //element is distinct
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false)
                res++;
        }
        return res;
    }

    static int distinctEfficient(int[] arr, int n) {
        HashSet<Integer> ele = new HashSet<Integer>();
        for (int x : arr)
            ele.add(x);
        return ele.size(); // HashSet only allows distinct values to be added
    }

    static int hashmapApproach(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int x : arr) {
            if (!h.containsKey(x))
                h.put(x, 1);
            else h.put(x, h.get(x) + 1);
        }
        return h.size();
    }
}
