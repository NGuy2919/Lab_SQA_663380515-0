package sqa.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

class TestCountWord {

	// สร้าง Test Cases สำหรับ @ParameterizedTest
    static Stream<Arguments> provideArraysForCountClumps() {
        return Stream.of(
            Arguments.of(null, 0),
            Arguments.of(new int[]{}, 0),
            Arguments.of(new int[]{1, 2, 3}, 0),
            Arguments.of(new int[]{1, 1,3}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArraysForCountClumps")
    void testCountClumps(int[] input, int expected) {
        assertEquals(expected, CountWordClumps.countClumps(input));
    }
}

