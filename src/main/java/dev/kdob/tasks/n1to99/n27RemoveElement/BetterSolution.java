package dev.kdob.tasks.n1to99.n27RemoveElement;

/**
 * The solution works a bit faster as it swaps the last element with the element to be removed
 * instead of shifting all elements one position to the left.
 * However, the solution relies on the condition that the order of elements can be changed.
 */
public class BetterSolution implements RemoveElementSolution {

    @Override
    public int removeElement(final int[] nums, final int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}