package dev.kdob.tasks.n1to99.n27RemoveElement;

public class MyFirstSolution implements RemoveElementSolution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int insertPointer = 0, checkPointer = 0;

        while (checkPointer < nums.length) {
            if (nums[checkPointer] != val) {
                nums[insertPointer] = nums[checkPointer];
                insertPointer++;
            }
            checkPointer++;
        }
        return insertPointer;
    }
}
