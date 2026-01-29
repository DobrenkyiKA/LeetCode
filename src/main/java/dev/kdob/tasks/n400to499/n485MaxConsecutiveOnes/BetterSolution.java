package dev.kdob.tasks.n400to499.n485MaxConsecutiveOnes;

/**
 * Replacing pointers to one's counters simplifies the code,
 * at the same time leaving the time and space complexity the same.
 * Time complexity: O(N)
 * Space complexity: O(N)
 */
public class BetterSolution implements FindMaxConsecutiveOnes {

    @Override
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (final int num : nums) {
            if (num == 1) {
                count += 1;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return Math.max(maxCount, count);
    }
}