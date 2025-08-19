package sqa.main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqa.main.MassConverter;

class Test05 {

	@Test
	void testGetFactor() {
		MassConverter con = new MassConverter();
		double result = con.getConversionFactor("teaspoon", "gram");
		assertEquals(3,result);
	}

}
