package com.practice;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {10, 12, 10, 15, 10, 20, 12, 12};
        //frequencyNaive(arr, arr.length);
        frequencyEfficient(arr);
    }
    static void frequencyNaive(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            boolean isSeen = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isSeen = true;
                    break;
                }
            }
            if (isSeen)
                continue;
            int frequency = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    frequency++;
            }
            System.out.println(arr[i] + " " + frequency);
        }
    }
    static void frequencyEfficient(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();  //key => number, value => count
        for (int x : arr) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}


/*
*   The if-else block in HashMap approach can be improved into a single statement also
*   map.put(x, map.getOrDefault(x, 0) + 1);
*  */