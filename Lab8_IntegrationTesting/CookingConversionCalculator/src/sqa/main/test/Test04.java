package sqa.main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqa.main.StubGetConversionLiquid;

class Test04 {

	@Test
	void testConverFromStubGetConversionLiquid() {
		StubGetConversionLiquid getconversion = new StubGetConversionLiquid();
		double result = getconversion.getConversionFactor("liter", "gallon");
		assertEquals(0.264,result);
	}

}
