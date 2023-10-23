package Labs;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        /* 1) Write a recursive method that accepts two arguments into the parameter x and y.
         The function should return a value of x times y. Remember multiplication can be performed as repeated addition as follows:
        7 * 4 = 4 + 4 + 4 + 4 + 4 + 4 + 4
        System.out.PRINTLN(multiply(7, 0)); */

        /* count of odd numbers up to n
        System.out.println(countOfOddNumbers(0));
        System.out.println(countOfOddNumbers(1));
        System.out.println(countOfOddNumbers(9)); */

        /*
        2)	Consider the method displayRowOfCharacters that displays any given character the specified number of times on one line

        displayRowOfCharacters('*', 5); */

        /*
        3)	Write three different recursive methods that each compute the sum of integers in an array of integers.
         Model your methods after displayArray methods are discussed in the lecture slide
         array(length) + array(length-1)+ array(length-1) ..

        System.out.println(sumOfArray1(new int[]{1,2,3,4}, 4));
        System.out.println(sumOfArray1(new int[]{1}, 1));

         */


        /*
        4)	Write a method that returns the largest value in an array that is passed as an argument.
                The method should use recursion to find the largest element.

        System.out.println(largestValue(new int[]{2,9,5,6}, 0,0));

         */


        /*
        5)	Write a method that asks the user for integer input that is between 1 and 10, inclusive.
        If the input is out of range, the method should recursively ask the user to enter a new input value.

        System.out.println(userInput());

         */

        /*
        6)	Write a recursive method that displays a portion of a given array backward.
                Consider the last entry in the portion first.
                 arrayBackwards(new int[]{2,9,5,6}, 1,3);
         */

        /*
        7)	Repeat question 5, but write a string backward instead of an array.
         */

        stringBackwards("Datastructures", 3, 6);


    }

    private static void arrayBackwards(int[] array, int first, int last) {
        if (last < first) {
            return;
        }
        System.out.print(array[last]);
        arrayBackwards(array, first, last - 1);
    }

    private static void stringBackwards(String sentence, int first, int last) {
        if (last < first) {
            return;
        }
        System.out.print(sentence.charAt(last));
        stringBackwards(sentence, first, last - 1);
    }

    private static int userInput() {
        System.out.println("Pls input a num 1-10");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if (value < 1 || value > 10) {
            return userInput();
        } else {
            return value;
        }

    }

    private static int largestValue(int[] array, int index, int largest) {
        if (largest <= array[index]) {
            largest = array[index];
        }
        if (index == array.length - 1) {
            return largest;
        } else {
            return largestValue(array, index + 1, largest);
        }

    }

    private static int sumOfArray1(int[] array, int arrayLength) {
        if (arrayLength == 0) {
            return 0;
        }
        int arrayIndex = arrayLength - 1;
        if (arrayLength == 1) {
            return array[arrayIndex];
        }
        return array[arrayIndex] + sumOfArray1(array, arrayLength - 1);
    }

    private static void displayRowOfCharacters(char c, int count) {
        if (count > 1) {
            displayRowOfCharacters(c, count - 1);
        }
        System.out.print(c);

    }

    private static int countOfOddNumbers(int n) {
        if (n < 1) {
            return 0;
        } else if (n % 2 == 0) {
            return countOfOddNumbers(n - 1);
        } else {
            return 1 + countOfOddNumbers(n - 1);
        }

    }

    private static int multiply(int x, int y) {
        if (y == 1) {
            return x;
        }
        if (y == 0) {
            return 1;
        }
        return x + multiply(x, --y);
    }

}
