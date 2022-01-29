package com.subarrayquestions;

import java.util.HashMap;

public class EqualZeroOne {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 1, 0, 1, 1, 1};
        System.out.println(largestZeroSubarray(arr, arr.length));
    }

    static int longestSubarrNaive(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int countZero = 0, countOne = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0)
                    countZero++;
                else
                    countOne++;
                if (countOne == countZero)
                    res = Math.max(res, countZero + countOne);
            }
        }
        return res;
    }

    static int largestZeroSubarray(int arr[], int n)
    {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int sum = 0, maxLen = 0;
        for(int i = 0; i < n; i++)
            arr[i] = (arr[i] == 0) ? -1 : 1;

        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
            if (sum == 0)
                maxLen = i+1;

            if(hm.containsKey(sum + n))
            {
                if(maxLen < i - hm.get(sum + n))
                    maxLen = i - hm.get(sum + n);

            }else hm.put(sum + n, i);
        }
        return maxLen;
    }
}
