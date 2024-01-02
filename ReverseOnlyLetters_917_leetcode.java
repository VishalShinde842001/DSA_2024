package com.Strings;

import java.math.BigInteger;

public class ReverseOnlyLetters_917_leetcode {
    public static void main(String[] args) {

        String str="Test1ng-Leet=code-Q!";
        ReverseOnlyLetters_917_leetcode r=new ReverseOnlyLetters_917_leetcode();

        System.out.println(r.reverseOnlyLetters(str));
    }
    public String reverseOnlyLetters(String s) {
        char[] ch=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
          int st=isChar(ch[start]);
          int en=isChar(ch[end]);
          if(st==0&&en==0){
              start++;
              end--;
          }
          else if(st==0&&en==1){
              start++;
          }
          else if(en==0&&st==1){
              end--;
          }else{
              char c=ch[start];
              ch[start]=ch[end];
              ch[end]=c;
              start++;
              end--;
          }

        }
        return new String(ch);

    }
    public int isChar(char ch){
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
            return 1;
        }
        return 0;
    }

}
