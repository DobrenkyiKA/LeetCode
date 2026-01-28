package dev.kdob.tasks.n100to199.n167TwoSumIIInputArrayIsSorted;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    static Stream<Arguments> solutions() {
        return Stream.of(
                arguments("BetterSolution", new BetterSolution()),
                arguments("MyFirstSolution", new MyFirstSolution())
        );
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void example1(String name, TwoSumSolution solution) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void example2(String name, TwoSumSolution solution) {
        int[] numbers = {2, 3, 4};
        int target = 6;
        int[] expected = {1, 3};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void example3(String name, TwoSumSolution solution) {
        int[] numbers = {-1, 0};
        int target = -1;
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void minimalArray(String name, TwoSumSolution solution) {
        int[] numbers = {1, 2};
        int target = 3;
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void allNegatives(String name, TwoSumSolution solution) {
        int[] numbers = {-5, -4, -3, -2, -1};
        int target = -8;
        int[] expected = {1, 3};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void withZeros(String name, TwoSumSolution solution) {
        int[] numbers = {0, 0, 3, 4};
        int target = 0;
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void largeNumbers(String name, TwoSumSolution solution) {
        int[] numbers = {-1000, -500, 0, 500, 1000};
        int target = 0;
        int[] expected = {1, 5};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void targetAtEnds(String name, TwoSumSolution solution) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 100};
        int target = 101;
        int[] expected = {1, 10};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void multipleSameValues(String name, TwoSumSolution solution) {
        int[] numbers = {5, 25, 75};
        int target = 100;
        int[] expected = {2, 3};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void largeArray(String name, TwoSumSolution solution) {
        int n = 30000;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i * 2;
        }
        // target is the sum of the last two elements
        int target = (n - 2) * 2 + (n - 1) * 2;
        int[] expected = {n - 1, n};
        assertArrayEquals(expected, solution.twoSum(numbers, target));
    }
}
