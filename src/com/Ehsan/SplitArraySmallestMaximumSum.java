package com.Ehsan;

public class SplitArraySmallestMaximumSum {
    public static void main(String[] args) {
        int[] arr = {7,2,8,5,10};
        int m = 2;
        int ans = splitArray(arr,m);
        System.out.println(ans);
    }
    static int splitArray(int[] arr, int m){
        int start = 0;
        int end =0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start,arr[i]);
            end += arr[i];
        }
        while(start < end){
            int mid = start + (end - start)/2;
            int sum = 0;
            int pieces = 1;
            for(int num : arr){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }
            if(m < pieces){
              start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}