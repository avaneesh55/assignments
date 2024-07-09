package java8;

public class SumOfAllDigits {
	
	public static void main(String[]args){
		int number = 8674690;

		int sumOfDigits= String.valueOf(number)
		.chars()
		.map(Character::getNumericValue)
		.sum();
		 
		System.out.println("Number: "+ number); 
		System.out.println("Sum of digits:"+sumOfDigits);
		}


}
