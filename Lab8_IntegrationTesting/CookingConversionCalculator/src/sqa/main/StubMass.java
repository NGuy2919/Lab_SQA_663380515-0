package sqa.main;

public class StubMass extends MassConverter{

	@Override
    public double convert(double massValue, String fromUnit, String toUnit) {
		return 125.0; 
    }
}
