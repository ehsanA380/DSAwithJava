package com.Ehsan;

import javax.xml.stream.events.StartDocument;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2,3,5,7,9,12,14,16};
        int target =17;
        int ans = ceilingNumber(arr,target);
        int floor = floorNumber(arr,target);
        System.out.println(ans);
        System.out.println(floor);
    }
    // ceiling Number; return index : smallest number >= target
    static int ceilingNumber(int[] arr, int target){
        // but what if the target is greater than the greatest number in the array
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start =0;
        int end = arr.length-1;
        while(start<=end){
           int  mid = start + (end - start)/2;

            if(arr[mid]>target){
                end = mid -1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
    //floorNumber : return the index : greatest number <= target
    static int floorNumber(int[] arr, int target){
        // but what if the target is smaller than the smallest number in the array
        if(target<arr[0]){
            return -1;
        }
        int start =0;
        int end = arr.length-1;
        while(start<=end){
           int  mid = start + (end - start)/2;

            if(arr[mid]>target){
                end = mid -1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return end;


    }
}