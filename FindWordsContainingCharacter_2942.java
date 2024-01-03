package com.Arrays;
import java.util.ArrayList;
import java.util.List;
public class FindWordsContainingCharacter_2942 {
    public static void main(String[] args){
        String[] words={"leet","code"};
        char x='e';
        FindWordsContainingCharacter_2942 f=new FindWordsContainingCharacter_2942();
        for(Integer i:f.findWordsContaining(words,x)){
            System.out.print(i+" ");
        }
        

    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(String.valueOf(x))){
                list.add(i);
            }
        }
        return list;
    }


}
