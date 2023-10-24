package C_5_Stacks;

import java.util.Stack;

/**
 * A class that checks whether parentheses ,
 * brackets and braces in a sting occur in left/right pairs
 */
public class BalanceChecker {
    public static void main(String[] args) {
        checkBalance("{[(expression)]}");
    }


    private static void checkBalance(String expression) {
        Stack<Character> delimiterStack = new Stack<>();
        char nextChar;

        for (int i = 0; i < expression.length(); i++) {

            nextChar = expression.charAt(i);

            switch (nextChar) {
                case '{':
                case '[':
                case '(':
                    delimiterStack.push(nextChar);
                    break;

                case '}':
                case ']':
                case ')':
                    delimiterStack.pop();
                    break;
            }
        }


    }
}
