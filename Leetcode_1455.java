package com.Strings;

public class Leetcode_1455 {
    public static void main(String[] args) {
        String sentence = "i love eating burger", searchWord = "burg";
        Leetcode_1455 l=new Leetcode_1455();
        System.out.println(l.isPrefixOfWord(sentence,searchWord));
    }
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s= sentence.split(" ");
        int i=0;
        for(String str: s){
            i++;
            if(str.startsWith(searchWord)) return i;
        }
        return -1;
    }
}
