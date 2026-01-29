package dev.kdob.tasks.n400to499.n485MaxConsecutiveOnes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    static Stream<Arguments> solutions() {
        return Stream.of(
                Arguments.arguments("MyFirstSolution", new MyFirstSolution()),
                Arguments.arguments("BetterSolution", new BetterSolution())
        );
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void shouldFindMaxConsecutive(String name, FindMaxConsecutiveOnes solution) {
        int[] nums = {1,1,0,1,1,1};
        int expected = 3;

        assertEquals(expected, solution.findMaxConsecutiveOnes(nums));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void shouldFindZeroOnes(String name, FindMaxConsecutiveOnes solution) {
        int[] nums = {0,0,0,0,0,0};
        int expected = 0;

        assertEquals(expected, solution.findMaxConsecutiveOnes(nums));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void shoudFindAllOnesWhenNoZeroes(String name, FindMaxConsecutiveOnes solution) {
        int[] nums = {1,1,1,1,1,1};
        int expected = 6;

        assertEquals(expected, solution.findMaxConsecutiveOnes(nums));
    }
}