package sqa.main;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTVPlan {

    @ParameterizedTest(name = "[{index}] Package: {0}, Offline: {1}, Live: {2}, Discount: {3} → Expected: {4}")
    @CsvSource({
        // STANDARD package
        "STANDARD, true, true, true, 300",
        "STANDARD, true, true, false, 350",
        "STANDARD, true, false, true, 200",
        "STANDARD, true, false, false, 250",
        "STANDARD, false, true, true, 200",
        "STANDARD, false, true, false, 250",
        "STANDARD, false, false, true, 100",
        "STANDARD, false, false, false, 150",

        // PREMIUM package
        "PREMIUM, true, true, true, 500",
        "PREMIUM, true, true, false, 550",
        "PREMIUM, true, false, true, 400",
        "PREMIUM, true, false, false, 450",
        "PREMIUM, false, true, true, 400",
        "PREMIUM, false, true, false, 450",
        "PREMIUM, false, false, true, 300",
        "PREMIUM, false, false, false, 350",

        // FAMILY package
        "FAMILY, true, true, true, 500",
        "FAMILY, true, true, false, 550",
        "FAMILY, true, false, true, 400",
        "FAMILY, true, false, false, 450",
        "FAMILY, false, true, true, 500",
        "FAMILY, false, true, false, 550",
        "FAMILY, false, false, true, 400",
        "FAMILY, false, false, false, 450"
    })
    void testPricePerMonth(String packageName, boolean offline, boolean live, boolean discount, double expected) {
        TVPlan.TVPackage selectedPackage = TVPlan.TVPackage.valueOf(packageName);
        TVPlan plan = new TVPlan(offline, live, discount);
        double actual = plan.pricePerMonth(selectedPackage);
        assertEquals(expected, actual, 0.001);
    }
}