package dev.kdob.tasks.n100to199.n167TwoSumIIInputArrayIsSorted;

public class BetterSolution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        // According to constraints, there is exactly one solution, so we should never reach here.
        return new int[0];
    }
}
