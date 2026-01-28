package dev.kdob.tasks.n1to99.n27RemoveElement;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {


    static Stream<Arguments> solutions() {
        return Stream.of(Arguments.arguments("MyFirstSolution", new MyFirstSolution()));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void removeOneElementTest(String name, RemoveElementSolution solution) {
        int[] nums = {1, 2, 3, 4, 5, 6, 0};
        int val = 0;
        int expected = 6;
        assertEquals(expected, solution.removeElement(nums, val));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void removeSeveralElementsTest(String name, RemoveElementSolution solution) {
        int[] nums = {1, 1, 6, 3, -45, 0, 1};
        int val = 1;
        int expected = 4;
        assertEquals(expected, solution.removeElement(nums, val));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void dontRemoveAnythingTest(String name, RemoveElementSolution solution) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int val = 7;
        int expected = 6;
        assertEquals(expected, solution.removeElement(nums, val));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void removeAllElementsTest(String name, RemoveElementSolution solution) {
        int[] nums = {0, 0, 0, 0, 0, 0};
        int val = 0;
        int expected = 0;
        assertEquals(expected, solution.removeElement(nums, val));
    }
}