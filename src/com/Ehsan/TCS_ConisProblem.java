package com.Ehsan;

import java.util.Arrays;

public class TCS_ConisProblem {
//    static int findMaxElem(int[] arr){
//        int max = 0;
//        for(int i = 0; i< arr.length; i++){
//            if(max<arr[i]){
//                max = arr[i];
//            }
//        }
//        return max;
//    }
    static int countMaxElem(int[] arr, int max){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==max){
                count++;
            }
        }
        return count;
    }
    static void makeZeroElem(int[] arr, int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==target){
                arr[i]= 0;
            }
        }
    }
    static int play(int[] arr, int players){
        int arrlenght = arr.length;
        int score = 0;
        while(arrlenght>0){
            int max = optimalSelect(arr);
            int countMax= countMaxElem(arr,max);
            score = score + (max * countMax);
            makeZeroElem(arr,max);
            for(int i = 1; i<players;i++){
                max = optimalSelect(arr);
                makeZeroElem(arr,max);
                arrlenght--;
            }
            arrlenght--;
        }

        return score;
    }
    static int optimalSelect(int[] arr){
        int max = 0;
        int max2 = 0;
        int index =0;
        int index2 =0;
        for(int i = 0;i<arr.length; i++){
            if(arr[i]==arr[index] && i>0){
                continue;
            }
            for(int j=0; j<arr.length; j++){
                if(arr[j]==arr[i]){
                    max+=arr[i];
                    index = i;
                }
            }
            if(max>max2){
                max2 = max;
                index2 = index;
                max=0;
            }else{
                max=0;
            }
        }
        if(max>max2){
            return arr[index];
        }
        return arr[index2];
    }
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,5,4,5};
        System.out.println(optimalSelect(arr));
        int players =4;
        System.out.println(play(arr,players));
//        for(int i : arr){
//            System.out.println(i);
//        }
    }
}
