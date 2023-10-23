package C_9_Searching;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 7, 9, 11};
        // option 1 - normal binary search
        System.out.println(binarySearch(nums, 9));
        // option 2- recursive binary search
        System.out.println(recursiveBinarySearch(nums, 0, nums.length - 1, 9));
        // option 3- Arrays
        System.out.println(nums[Arrays.binarySearch(nums, 9)]);

    }

    private static int binarySearch(int[] array, int numberToSearch) {
        int lowIndex = 0;
        int highIndex = array.length - 1;

        while (lowIndex <= highIndex) {
            int middleNumberIndex = (lowIndex + highIndex) / 2;
            int middleNumber = array[middleNumberIndex];

            if (middleNumber == numberToSearch) {
                return numberToSearch;
            } else if (numberToSearch < middleNumber) {
                highIndex = middleNumberIndex - 1;
            } else {
                lowIndex = middleNumberIndex + 1;
            }
        }
        return -1;
    }

    private static int recursiveBinarySearch(int[] array, int lowIndex, int highIndex, int numberToSearch) {

        int middleNumberIndex = (lowIndex + highIndex) / 2;
        int middleNumber = array[middleNumberIndex];

        if (lowIndex > highIndex) {
            return -1;
        }
        if (middleNumber == numberToSearch) {
            return numberToSearch;
        } else if (numberToSearch < middleNumber) {
            return recursiveBinarySearch(array, lowIndex, middleNumberIndex - 1, numberToSearch);
        } else if (numberToSearch > middleNumber) {
            return recursiveBinarySearch(array, middleNumberIndex + 1, highIndex, numberToSearch);
        }

        return -1;
    }

}
