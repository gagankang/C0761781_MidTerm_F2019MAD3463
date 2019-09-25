package com.lambton;
public class MidTermTest {
    public static void main(String[] args)
    {
        LambtonStringTools object = new LambtonStringTools();
        System.out.println(" Lambton "+object.reverse("Lambton"));
        System.out.println("1000 "+object.binaryToDecimal("1000"));
        System.out.println("100000 "+object.binaryToDecimal("1000"));
        System.out.println("01001101 "+object.binaryToDecimal("01001101"));
        System.out.println("1000.1 "+object.binaryToDecimal("1000.1"));
        System.out.println();
    }
}