package com.Ehsan;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,107,111,112,199,222,333};
        int target =333;
        int ans = ans(arr,target);
        System.out.println(ans);
    }
    // find ans
    static  int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
       while (target>arr[end]){
           int temp = end + 1; // this is my new start
           // double the box value
           // end = previous end + sizeOfBox*2
           end= end + (end -start +1)*2;
           start= temp;

       }
       return  binarySearch(arr,target,start,target);
    }

    // binarySearch
    static  int binarySearch(int[] arr, int target , int start ,int end ){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]>target){
                end = mid -1;
            }else if(arr[mid]<target){
                start = mid + 1;
            }else {
                return  mid;
            }
        }
        return -1;
    }
}
