package sqa.main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqa.main.LiquidVolumeConverter;

class Test06 {

	@Test
	void testGetFactor() {
		LiquidVolumeConverter con = new LiquidVolumeConverter();
		double result = con.getConversionFactor("pint", "ml");
		assertEquals(473.176,result);
	}

}
