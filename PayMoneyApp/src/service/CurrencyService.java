package service;
import java.util.ArrayList;
import java.util.List;

public class CurrencyService {
	// if the denominators array is not in descending order, then sort the elements in the descending order
	// use bubblesort/mergesort for sorting the elements.
	// Lets assume that the elements in the array is in descending sorted order
	public void denominatorService(int[] denominators, double amount) {
		boolean flag = true;
		List<String> result = new ArrayList<>();
		while(flag) {
			for (int i = 0; i < denominators.length; i++) {
				int numberOfDenominator = 0;
				while(amount >= denominators[i]) {
					amount = amount - denominators[i];
					numberOfDenominator++;
				}if(numberOfDenominator != 0) {
					result.add("Number of denominators :: " + numberOfDenominator + "currency:: " + denominators[i]);
				}
			}
			flag = false;
		}
		System.out.println(result);
	}
}

