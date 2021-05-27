package surprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise {

	private static Random randomNumberGenerator = new Random();
	private static ArrayList<String> candiesType = new ArrayList<String>(Arrays.asList("chocolate", "jelly", "fruits", "vanilla"));
	private int number;
	private String type;
	
	Candies(int number, String type) {
		this.number = number;
		this.type = type;
	}
	
	@Override
	public void enjoy() {
		System.out.println("Ai primit " + this.number + " bomboane de " + this.type);
	}
	
	@Override
	public String toString() {
		return "A primit " + this.number + " bomboane de tipul: " + this.type;
	}
	
	public static Candies generate() {
		return new Candies(Candies.randomNumberGenerator.nextInt(50), 
				Candies.candiesType.get(Candies.randomNumberGenerator.nextInt(Candies.candiesType.size())));
	}
}
