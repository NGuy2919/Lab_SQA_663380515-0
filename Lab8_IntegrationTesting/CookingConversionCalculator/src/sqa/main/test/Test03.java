package sqa.main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqa.main.StubGetConversionMass;

class Test03 {

	@Test
	void testConverFromStubGetConversionMass() {
		StubGetConversionMass getconversion = new StubGetConversionMass();
		double result = getconversion.getConversionFactor("oz", "gram");
		assertEquals(28.349,result);
	}

}
