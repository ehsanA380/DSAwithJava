package com.Ehsan;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int [] arr = {1,2,4,4,4,4,4,8,8};
        int target = 8;
        int[] ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
//        int start = search(nums , target, true);
//        int end = search (nums,target,false);
//       ans[0] = start;
//       ans[1] =
//        or------------------
        ans[0] = search(nums , target, true);
        if(ans[0]!= -1){
            ans[1]= search (nums,target,false);
        }
        // check for first occurrence  of target first

        return ans ;
    }
    // this function just returns the index value of target
    static  int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            // find the middle element
            int mid = start + (end - start)/2;
            if(target<nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else {
                // potential answer : found
                ans = mid;
                if(findStartIndex == true){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
