package com.lambton;

public class LambtonStringTools
{
    //Reverse the String
    public static void main(String[] args) {
        String s = "Lambton College";
        char r[] = s.toCharArray();
        char re[] = new char[r.length];
        int cnt = 0;
        for (int i = r.length - 1; i >= 0; i--) {
            re[cnt++] = r[i];
        }
        String reverseString = new String(re);
        System.out.println("Reverse String = " + reverseString);


    }
}