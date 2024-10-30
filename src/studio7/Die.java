package studio7;

public class Die {
	private int n;
	private int outcome;
	
	public Die(int initSides) {
		n = initSides;
		outcome = (int) (Math.random() * n + 1);
	}
	
	public static void main(String[] args) {
		Die roll1 = new Die(1000); //roll1 = instance of object
		System.out.println(roll1.outcome);
	}
}