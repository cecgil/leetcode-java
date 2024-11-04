package dasdsa;

public class ConvertTemperature {
	
	/*
	 * ou are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.

		You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].

	   Return the array ans. Answers within 10-5 of the actual answer will be accepted.
	 */
	
	public static void main(String[] args) {
		
		double[] ans = new double[2];
		
		aa(36.50);
		
		
	}
	
	
	public static double[] aa(double celsius) {
		double[] ans = new double[2];
		
		double kelvin = celsius + 273.15;
		double fahreneit = celsius * 1.80 + 32.00;
		
		ans[0] = kelvin;
		ans[1] = fahreneit;
		
		System.out.println(ans[0] + " , " + ans[1]);
		
		return ans;
		
	}

}
