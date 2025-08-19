package sqa.main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqa.main.TemperatureConverter;

class Test02 {

	
	@Test
	void testConvertTemp() {
		TemperatureConverter temp = new TemperatureConverter();
		double result = temp.convert(32.0, "fahrenheit","celsius");
		assertEquals(0.0,result);
	}

}
