package com.lambton;

public class LambtonStringTools
{
    //Reverse the String
    public static void main(String[] args) {
        String s = "Lambton";
        char r[] = s.toCharArray();
        char rev[] = new char[r.length];
        int cnt = 0;
        for (int i = r.length - 1; i >= 0; i--) {
            rev[cnt++] = r[i];
        }
        String reverseString = new String(rev);
        System.out.println("Reverse String = " + reverseString);
    }
}