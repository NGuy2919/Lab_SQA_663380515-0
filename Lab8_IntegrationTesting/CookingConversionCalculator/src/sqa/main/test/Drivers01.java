package sqa.main.test;

import sqa.main.CookingConversionCalculator;
import sqa.main.LiquidVolumeConverter;
import sqa.main.MassConverter;
import sqa.main.TemperatureConverter;

public class Drivers01 {

	public static void main(String[] args) {
		//TemperatureConverter
		double value1 = 100.0;
		double convertedValue1 = 0.0;
		String from1 = "fahrenheit";
		String to1 = "celsius";//37.778
		
		TemperatureConverter convert1 = new TemperatureConverter();
		
		convertedValue1 = convert1.convert(value1, from1, to1);
		System.out.println(value1 + " " + from1 + " = " + convertedValue1 + " " + to1);

		
		//getConversionFactor() Mass
		double value2 = 2.205;
		double convertedValue2 = 0.0;
		String from2 = "kilogram";
		String to2 = "pound";//2.205
		
		MassConverter convert2 = new MassConverter();
		convertedValue2 = convert2.getConversionFactor(from2, to2);
		System.out.println(value2 + " = " + convertedValue2 );
		
		
		//getConversionFactor() Liquid
		double value3 = 0.946;
		double convertedValue3 = 0.0;
		String from3 = "quart";
		String to3 = "liter";//0.946
		
		LiquidVolumeConverter convert3 = new LiquidVolumeConverter();
		convertedValue3 = convert3.getConversionFactor(from3, to3);
		System.out.println(value3 + " = " + convertedValue3 );
		
		
		//MassConverter 
		double value4 = 100.0;
		double convertedValue4 = 0.0;
		String from4 = "teaspoon";
		String to4 = "gram";//300.0
		
		MassConverter convert4 = new MassConverter();
		
		convertedValue4 = convert4.convert(value4, from4, to4);
		System.out.println(value4 + " " + from4 + " = " + convertedValue4 + " " + to4);
		
		
		//LiquidVolumeConverter
		double value5 = 150.0;
		double convertedValue5 = 0.0;
		String from5 = "quart";
		String to5 = "liter";//141.9
		
		LiquidVolumeConverter convert5 = new LiquidVolumeConverter();
		
		convertedValue5 = convert5.convert(value5, from5, to5);
		System.out.println(value5 + " " + from5 + " = " + convertedValue5 + " " + to5);
		
		
		//CookingConversionCalculator
		double value6 = 150.0;
		double convertedValue6 = 0.0;
		String from6 = "tablespoon";
		String to6 = "gram";//1200.0
		String choice  = "mass";
		
		CookingConversionCalculator convert6 = new CookingConversionCalculator();
		convertedValue6 = convert6.convert(value6, choice, from6, to6);
		System.out.println("My Choice is " + choice + " , " + value6 + " " + from6 + " = " + convertedValue6 + " " + to6);
	}

}
