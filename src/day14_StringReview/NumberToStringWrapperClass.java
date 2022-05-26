package day14_StringReview;

public class NumberToStringWrapperClass {

	public static void main(String[] args) {

	// BYTE TO STRING
		byte age = 60;
		
		String ageAsString = Byte.toString(age);
		
		System.out.println(ageAsString); //60
		
		System.out.println(ageAsString.charAt(0)); // 6
		
	// INT TO STRING	
		
		int distance = 1000;
		
		String distanceAsString = Integer.toString(distance);
		
		System.out.println(distanceAsString);

		
	// DOUBLE TO STRING
		
		double price = 9.99;
		
		String priceAsString = Double.toString(price);
		
		System.out.println(priceAsString);
		
		System.out.println(priceAsString.length());
		
		System.out.println(priceAsString.charAt(1));
		

		
	}

}
