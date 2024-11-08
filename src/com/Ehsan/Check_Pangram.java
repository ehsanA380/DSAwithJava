package com.Ehsan;

public class Check_Pangram {
    static boolean checkPangram(String str){
        boolean mark [] = new boolean[26];
        int index =0;
        for ( int i =0 ; i< str.length();i++){
            if('A'<= str.charAt(i) && 'Z'>= str.charAt(i)){
                index = str.charAt(i) - 'A';
//                System.out.println(i + " " + index);
            } else if ('a'<= str.charAt(i) && 'z'>= str.charAt(i)) {
                index = str.charAt(i) - 'a';
//                System.out.println(i + " " + index + " " + str.charAt(i));

            }
            mark [index] = true;
        }
        for(int i =0 ; i<26; i++){
            if(mark[i]==false){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A quick brown fox jumps over the lazy dog";
//        System.out.println('A'-0);
        System.out.println(checkPangram(str));

    }
}
