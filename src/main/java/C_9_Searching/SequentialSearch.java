package C_9_Searching;

public class SequentialSearch {
    public static void main(String[] args) {

        int[] nums = new int[]{6, 2, 7, 3, 6, 9, 5, 3, 1, 4};
        int entry = 7;

        isEntryAvailable(nums, entry);


    }

    private static boolean isEntryAvailable(int[] nums, int entry) {
        //iterative sequential search
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == entry) {
                return true;
            }
        }
        return false;
    }

}
