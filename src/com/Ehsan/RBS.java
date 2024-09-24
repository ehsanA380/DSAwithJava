package com.Ehsan;

public class RBS {
    public static void main(String[] args) {
//        int [] arr = {4,5,6,7,0,1,2};
        int [] arr = {1,3,5};

        System.out.println(findPivot(arr));
//        System.out.println(search(arr,1));
        System.out.println(search(arr,5));
    }
    static int search(int[] nums, int target){
        int pivot = findPivot(nums);
        // if you did not find  a pivot , it means the array is not rotated
        if(pivot == -1){
//           just do normal binary search
            return  binarySearch(nums,target,0,nums.length-1);
        }
        // if pivot is found , you have found 2 asc sorted
        if(target == nums[pivot]){
            return pivot;
        }

        if(target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1, nums.length-1);
    }
    // binarySearch
    static int binarySearch(int[] arr, int target,int start,int end){
        while(start<=end){
            // find the middle element
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                return  mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            // 4 case over here
            if(mid < end && arr[mid]>arr[mid+1]){
                return  mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return  mid-1;
            }
            if(arr[mid]>=arr[start]){
                start= mid + 1;
            }else{
                end= mid - 1;
            }
        }
        return -1;
    }
}