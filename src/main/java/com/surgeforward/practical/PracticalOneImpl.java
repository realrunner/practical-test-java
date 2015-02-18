package com.surgeforward.practical;

import java.util.Stack;
import java.util.StringTokenizer;

public class PracticalOneImpl implements PracticalOne {

    public String reverseWordsInString(String words) {
        if(words == null || words.isEmpty() || !words.contains(" "))
        return words;

        String reversed = "";
        for(String word : words.split(" ")) {
            reversed = word + " " + reversed;
        }

        return reversed.trim();
    }

    public int doCalculation(String expression) {
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-", true);

        if(tokenizer.countTokens() ==  1)
            return parseNum(expression);

        Stack<String> stack = new Stack<String>();
        while(tokenizer.hasMoreElements()) {
            String token = tokenizer.nextToken();
            //System.out.println(token);
            stack.push(token);
            if(stack.size() == 3) {
                int and1 = parseNum(stack.get(0));
                String op = stack.get(1);
                int and2 = parseNum(stack.get(2));
                int result = 0;
                if(op.equals("+")) {
                    result = and1 + and2;
                }
                else if(op.equals("-")) {
                    result = and1 - and2;
                }
                stack.clear();
                stack.push(""+result);
            }
        }

        return parseNum(stack.peek());
    }

    public boolean isPalindrome(String palindrome) {
        char[] chars = palindrome.toLowerCase().toCharArray();
        for (int i = 0, j = (chars.length - 1); i < (chars.length / 2); i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }

    private int parseNum(String number) {
        try {
            return Integer.parseInt(number);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
            return -1;
        }
    }
}
