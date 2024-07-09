package java8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reverse_string {
	public static void main(String[]args)
	{
	System.out.println("Enter the word:"); 
	Scanner obj=new Scanner(System.in); 
	String input=obj.nextLine();


	String reversed =Arrays.stream(input.split("\\s+"))
	 
	.map(word->new
	StringBuilder(word).reverse().toString())
	.collect(Collectors.joining(""));
	System.out.println("Original string: "+ input);
	System.out.println("Stringwithreversedwords:"+reversed);
	}

	
	
	
}
