package util;

public class ConvertDolar {

	public static final double IOF = 0.06;
	
	public static double convert (double dolar) {
		return dolar += dolar * IOF;
	}
	
	
	
}
