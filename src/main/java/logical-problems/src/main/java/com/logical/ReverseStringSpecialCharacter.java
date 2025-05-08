package com.logical;

import java.util.*;
import java.util.stream.Collectors;

//Reversal program with special characters.
//        Input : Swa$pn&il
//Output : lin$pa&wS
public class ReverseStringSpecialCharacter
{
    public static void main(String[] args)
    {
        String str = "aaabbaanjkkllaajjaaabbnj";
        Map<String, Integer> map = new LinkedHashMap<>();
        int n = str.length();
        StringBuilder sb = new StringBuilder();

        for(int i= 0;i<n;i++){
            sb.append(str.charAt(i));
            if( str.charAt(i) != str.charAt(i+1)){
                map.put(sb.toString(), sb.length());
                sb.setLength(0);
            }
        }
        System.out.println(map);
    }
}
