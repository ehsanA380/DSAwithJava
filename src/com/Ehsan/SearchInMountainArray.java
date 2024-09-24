package com.Ehsan;
//https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountainArray {
    /*
    Interface position need to be completed------------+++++++++++++++++++++++++++++++++++++++++++++++ ###########33
     */

    public static void main(String[] args) {
//        System.out.println(findInMountainArray());
    }
    // this is leetcode checked function---------
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int peak = findPeakElement(mountainArr);
//        if(mountainArr.get(peak)==target){
//            return peak;
//        }
//        int start = 0;
//        int end = mountainArr.length()-1;
//        int firstTry = agnosticBinarySearch(mountainArr,target,start,peak);
//        if(firstTry!= -1){
//            return firstTry;
//        }else {
//            return agnosticBinarySearch(mountainArr,target,peak,end);
//        }
//
//    }
//    // function to find the peak element
//    static int findPeakElement( MountainArray arr) {
//        int start = 0;
//        int end = arr.length()-1;
//        while (start<end){
//            int mid = start + (end - start)/2;
//            if(arr.get(mid) > arr.get(mid + 1)){
//                end = mid ;
//            }else {
//                start = mid + 1;
//            }
//        }
//        return  start;
//    }
//    static int agnosticBinarySearch(MountainArray arr, int target, int start, int end ){
//        boolean isAsc = false;
//        if(arr.get(start)<arr.get(end)){
//            isAsc = true;
//        }
//        while (start<=end){
//            int mid = start + (end - start)/2;
//            if(arr.get(mid)==target){
//                return mid;
//            }
//            if(isAsc){
//                if(arr.get(mid)>target){
//                    end= mid-1;
//                }else {
//                    start = mid + 1;
//                }
//            }else{
//                if(arr.get(mid)<target){
//                    end= mid-1;
//                }else {
//                    start = mid + 1;
//                }
//            }
//        }
//        return -1;
//    }
}
