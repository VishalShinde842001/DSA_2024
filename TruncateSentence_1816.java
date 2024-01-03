package com.Arrays;

public class TruncateSentence_1816 {
    public static void main(String[] args) {
        String str="Hello how are you Contestant";
        TruncateSentence_1816 t=new TruncateSentence_1816();
        System.out.println(t.truncateSentence(str,4));
    }
    public String truncateSentence(String s, int k) {
        String[] str=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(str[i]).append(" ");
        }
        return sb.toString().trim();


    }

}
