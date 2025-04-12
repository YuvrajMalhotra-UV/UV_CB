package lec18;

import java.util.ArrayList;

public class subsequenceINarray {
    public static void helper(int [] arr , int i , String ans,int sum1 , int sum2 , ArrayList <Integer> g1, ArrayList <Integer> g2){
        g1.add(arr[i]);
        helper(arr,i+1,ans, sum1+arr[i],sum2,g1,g2);
        g1.remove(g1.size()-1);
        g2.add(arr[i]);
        if (i==arr.length){
            System.out.println(ans);
            return;
        }
        

        }
    }


