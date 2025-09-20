package com.interview;

import java.util.HashMap;

public class MoveAllZeroLast {
    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        //output:1 9 8 4 2 7 6 9 0 0 0 0
//        int i =0;
//        int size = arr.length;
//        int j;
//        int temp;
//        while(i!= size -1){
//            if(arr[i]==0){
//                j = i+1;
//                while(arr[j]==0 && j !=size-1){
//                    j++;
//                }
//                temp = arr[i];
//                arr[i] = arr[j];
//                arr[j]= temp;
//            }
//            i = i+1;
//        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[j]!=0)
                    {
                        int temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                        break;
                    }
                }
            }
        }
        for (int i1:arr) {
            System.out.println(i1);
        }

        HashMap<String,Integer> map=new HashMap<>();
        String inputString = "aaabbaanjkkllaajjaaabbnj";
        int temp1=0;
        for(int i1=1;i1<inputString.length();i1++)
        {
            if(inputString.charAt(temp1)!=inputString.charAt(i1))
            {
                String str=""+inputString.substring(temp1,i1);
                map.put(str,map.getOrDefault(str,0)+1);
                temp1=i1;
            }
        }
        System.out.println(map);

    }
}
