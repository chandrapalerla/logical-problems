package com.arrays;

public class Test {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
       int n =  arr.length;
       int sum = 0;
       int i=0;
      while(i<n){
           sum  = sum+arr[i];
           i++;
       }
        System.out.println(sum);
    }
}
