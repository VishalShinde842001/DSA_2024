package com.Strings;
import java.math.BigInteger;
public class AddStrings_415_leetcode {
    public static void main(String[] args) {
        String num1="11";
        String num2="123";
        AddStrings_415_leetcode a=new AddStrings_415_leetcode();
        System.out.println(a.addStrings(num1,num2));
    }


    public String addStrings(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        return n1.add(n2).toString();
    }

    //Not Applicable for all numbers
    public String addStrings1(String num1, String num2) {
        long n1=Long.parseLong(num1);
        long n2=Long.parseLong(num2);
        return String.valueOf(n1+n2);

    }
}
