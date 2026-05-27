package com.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParenthesis {
    static void main() {
        String input1 = "{[()]}";
        String input2 = "{[(])}";

        System.out.println(input1 + " -> " + isBalancedWithStack(input1));
        System.out.println(input2 + " -> " + isBalancedWithMap(input2));
    }

    private static boolean isBalancedWithMap(String input2) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (char ch : input2.toCharArray()) {
            if(map.containsValue(ch)){
                stack.push(ch);
            } else if(map.containsKey(ch)){
                if(stack.isEmpty() || stack.pop()!=map.get(ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isBalancedWithStack(String input1) {
        Stack<Character> balance = new Stack<>();
        for (char ch : input1.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                balance.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if(balance.isEmpty()){
                    return false;
                }
                char top = balance.pop();
                // Check matching pairs
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }

            }
        }
        return balance.isEmpty();
    }

}
