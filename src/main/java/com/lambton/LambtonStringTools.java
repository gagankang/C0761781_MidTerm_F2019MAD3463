package com.lambton;

public class LambtonStringTools {

    //Reverse the String
    public static String main(String[] args) {
        String reverse = "Lambton College in Toronto";
        char ch[] = reverse.toCharArray();
        char re[] = new char[ch.length];
        int count = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            re[count++] = ch[i];
        }
        {
            String reverseString = new String(re);
            System.out.println("String Reversed =" + reverseString);

        }


    }
}




