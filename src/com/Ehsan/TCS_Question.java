package com.Ehsan;

import java.util.Scanner;

public class TCS_Question {
     static void solution(int [] arr){
        String [] week={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for(int i =0;i<arr.length;i++){
            System.out.println(week[i] + ": " + arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] a;
        int [] arr = {1,2,3,4,5,6,7};

        solution(arr);
    }
}
