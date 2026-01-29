package dev.kdob.tasks.n400to499.n485MaxConsecutiveOnes;

/**
 * Time complexity: O(N)
 * Space complexity: O(N)
 */
public class MyFirstSolution implements FindMaxConsecutiveOnes {

    @Override
    public int findMaxConsecutiveOnes(int[] nums) {
        int startWindowPointer = 0;
        int endWindowPointer = 0;
        int maxConsecutiveOnes = 0;
        boolean isNewWindowStart = false;

        while (endWindowPointer < nums.length) {
            if (nums[endWindowPointer] == 1 && !isNewWindowStart) {
                startWindowPointer = endWindowPointer;
                isNewWindowStart = true;
            }
            if (nums[endWindowPointer] == 0 && isNewWindowStart) {
                if (endWindowPointer - startWindowPointer > maxConsecutiveOnes) {
                    maxConsecutiveOnes = endWindowPointer - startWindowPointer;
                }
                isNewWindowStart = false;
            }
            endWindowPointer++;
        }

        if (nums[endWindowPointer - 1] == 1 && isNewWindowStart) {
            if (endWindowPointer - startWindowPointer > maxConsecutiveOnes) {
                maxConsecutiveOnes = endWindowPointer - startWindowPointer;
            }
        }

        return maxConsecutiveOnes;
    }
}