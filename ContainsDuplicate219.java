package com.Arrays;

import java.util.HashMap;

public class ContainsDuplicate219 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,3};
        ContainsDuplicate219 c=new ContainsDuplicate219();
        System.out.println(c.containsNearbyDuplicate(arr,2));
    }
    //Try With HashMap
    public boolean containsNearbyDuplicate(int[] arr, int k){
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }
            else{
                int g= map.get(arr[i]);
                int j=Math.abs(i-g);
                if(j<=k){
                    return true;
                }
                map.put(arr[i],i);

            }
        }
        return false;
    }


    //Taking time exceeds
    public boolean containsNearbyDuplicate1(int[] arr, int k) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int f=Math.abs(i-j);
                if(arr[i]==arr[j]&&f<=k){
                    return true;
                }
            }
        }
        return false;
    }


}
