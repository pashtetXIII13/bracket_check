package org.example;

import java.util.Stack;

/**
 * @author pashtet
 */

public class BracketsChecker {
    public boolean check(String text){

        String brackets = text.replaceAll("[^(){}\\]\\[]+", "");
        if (brackets.isEmpty()) return false;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < brackets.length(); i++) {
            char ch = brackets.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') stack.push(ch);
            if ((ch == '}' || ch == ']' || ch == ')') && !stack.isEmpty()){
                char backBracket = stack.pop();
                if ((ch == '}' && backBracket != '{') ||
                    (ch == ']' && backBracket != '[') ||
                    (ch == ')' && backBracket != '('))  return false;
            }
        }
        return stack.isEmpty();
    }
}
