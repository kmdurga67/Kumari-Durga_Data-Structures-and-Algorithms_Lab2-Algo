package service;

public class TransactionService {

	public void checkTransactionTarget(int[] array, int target) {
		/*
		 * write a for loop looping through the array
		 */
		int totalCount = 0;
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			// count the value of transaction using a temp variable
			totalCount = totalCount + array[i];
			// check if the value of totalcount has exceeded the target value
			if (totalCount > target) {
				// has met the target value.
				// the target value is achieved after i+1 value
				System.out.println("Target value acheived after " + i + " transactions");
				flag = true;
				break;
			} 
		}
		if(!flag) {
			System.out.println("Target value not achieved after "+ (array.length + 1) + " transactions");
		}
		
	}

	public void checkTransactionTarget2(long[] array, long target) {
		/*
		 * write a for loop looping through the array
		 */
		long totalCount = 0;
		for (long i = 0; i < array.length; i++) {
			// count the value of transaction using a temp variable
			totalCount = totalCount + array[(int) i];
			// check if the value of totalcount has exceeded the target value
			if (totalCount < target) {
				continue;
			}
			System.out.println("Target value is  achieved after " + (i + 1) + " transactions");

		}
	}

}
