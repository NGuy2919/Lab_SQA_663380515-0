package sqa.main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqa.main.StubLiquid;
import sqa.main.StubMass;
import sqa.main.StubTemp;

class Test01 {
	@Test
    void testConverFromStubTemp() {
		StubTemp converter = new StubTemp();
        double result = converter.convert(150.0,"fahrenheit", "celsius");
        assertEquals(65.556, result); 
    }
	
	@Test
	void testConverFromStubMass() {
		StubMass converter = new StubMass();
		double result = converter.convert(1.0, "cup", "gram");
		assertEquals(125.0,result);
	}
	
	@Test
	void testConverFromStubLiquid() {
		StubLiquid converter = new StubLiquid();
		double result = converter.convert(1000.0, "ml", "oz");
		assertEquals(34.0,result);
	}
}
