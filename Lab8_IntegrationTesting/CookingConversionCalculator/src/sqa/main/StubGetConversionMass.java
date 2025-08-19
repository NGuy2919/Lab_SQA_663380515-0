package sqa.main;

public class StubGetConversionMass extends MassConverter{

	@Override
    public double getConversionFactor(String fromUnit, String toUnit) {
		return 28.349; 
    }
	
}
