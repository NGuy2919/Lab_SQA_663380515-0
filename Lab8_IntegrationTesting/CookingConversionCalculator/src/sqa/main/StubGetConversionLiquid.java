package sqa.main;

public class StubGetConversionLiquid extends LiquidVolumeConverter{

	@Override
	public double getConversionFactor(String fromUnit, String toUnit) {
		return 0.264; 
    }
}
