package studio7;

public class Fraction {
	private double numerator;
	private double denominator;
	
	public Fraction(int num, int denom) {
		numerator = num;
		denominator = denom;
		
	}
	
	public FractionSum(int num1, int denom1, int num2, int denom2) {
		numerator = num1 * denom2 + num2 * denom1;
		denominator = denom1 * denom2;
		Fraction(numerator, denominator);
		
		crossMultiply = numerator / denominator ;
		return Fraction();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FractionSum(1,2,1,4);
		
	}

}
