package java8;
import java.util.Arrays; 
import java.util.Collections; 
import java.util.List;
import java.util.stream.Collectors;


public class Sort_decimalnumber {

	

	public static void main(String[]args){
	List<Double>decimals=Arrays.asList(3.2,1.5,4.8,2.1, 5.7);
	
	List<Object>sortedDecimals=decimals.stream().sorted().collect(Collectors.toList());
	
	// Reverse the sorted list Collections.reverse(sortedDecimals);
	System.out.println("Originallist:"+decimals);
	 
	System.out.println("Sortedlistinreverseorder:"+ sortedDecimals);
	}
	}



