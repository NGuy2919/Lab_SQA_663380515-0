package sqa.main;

public class StubLiquid extends LiquidVolumeConverter{

	@Override
    public double convert(double tempValue, String fromUnit, String toUnit) {
		return 34.0; 
    }
}
