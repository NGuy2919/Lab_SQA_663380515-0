package sqa.test;

import sqa.main.ShippingVehicle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class TestShipping {

    @ParameterizedTest
    @CsvSource({
    	"50, 20, 10, 10:20:50",
        "50, 20, -1, -1",
        "50, 20, 150, -1",
        "50, -5, 10, -1",
        "50, 250, 10, -1",
        "-10, 20, 10, -1",
        "600, 20, 10, -1",
        "-10, -5, -1, -1",
    })
    public void testCalculateIncome(int small, int medium, int large, String expected) {
    	ShippingVehicle ship = new ShippingVehicle();
        List<Integer> actual = ship.calculate(small, medium, large);

        List<Integer> expectedList;
        if (expected.equals("-1")) {
            expectedList = List.of(-1);
        } else {
            expectedList = Arrays.stream(expected.split(":"))
                                 .map(Integer::parseInt)
                                 .toList();
        }

        assertEquals(expectedList, actual);
    }
   }