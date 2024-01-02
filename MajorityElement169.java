package com.Arrays;

import java.util.HashMap;

public class MajorityElement169 {
    public static void main(String[] args) {
        int[] arr={2,2,2,2,1,1,1};
        MajorityElement169 m=new MajorityElement169();
        System.out.println(m.majorityElement(arr));
    }

    //Good but this is not optimal
    public int majorityElement(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        int re=arr.length/2;
        System.out.println(re);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                int a=map.get(arr[i]);
                map.put(arr[i],a+1);
                if(a+1>re){
                    return arr[i];
                }
            }
        }
        return 1;
    }

}
