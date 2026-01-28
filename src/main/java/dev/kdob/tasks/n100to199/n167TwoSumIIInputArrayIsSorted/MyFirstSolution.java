package dev.kdob.tasks.n100to199.n167TwoSumIIInputArrayIsSorted;

public class MyFirstSolution implements TwoSumSolution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int firstNumberIndex = 0;
        int secondNumberIndex = 1;
        while (numbers[firstNumberIndex] + numbers[secondNumberIndex] != target) {
            if (numbers[firstNumberIndex] + numbers[secondNumberIndex] > target || secondNumberIndex == numbers.length - 1) {
                firstNumberIndex++; // start with next first number
                secondNumberIndex = firstNumberIndex + 1;
                continue;
            }
            secondNumberIndex++;
        }
        result[0] = firstNumberIndex + 1;
        result[1] = secondNumberIndex + 1;
        return result;
    }
}
