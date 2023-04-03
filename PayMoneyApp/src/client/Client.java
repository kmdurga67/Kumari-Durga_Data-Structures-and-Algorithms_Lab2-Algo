package client;

import java.util.Scanner;

import service.TransactionService;

//public class Client {
//	public static void main(String args[]) throws Exception {
//		Scanner s = new Scanner(System.in);
//		System.out.println("enter the size of transaction array");
//		int size = s.nextInt();
//		int arr[] = new int[size];
//		System.out.println("enter the values of array");
//		for (int i = 0; i < size; i++)
//			arr[i] = s.nextInt();
//		System.out.println("enter the total no of targets that needs to be achieved");
//		int targetNo = s.nextInt();
//		while (targetNo-- != 0) {
//			int flag = 0;
//			long target;
//			System.out.println("enter the value of target");
//			target = s.nextInt();
//			long sum = 0;
//			for (int i = 0; i < size; i++) {
//				sum += arr[i];
//				if (sum >= target) {
//					System.out.println("Target achieved after "+(i + 1) + "transactions ");
//							flag = 1;
//					break;
//				}
//			}
//			if (flag == 0) {
//				System.out.println(" Given target is not achieved ");
//			}
//		}
//	}
//}

public class Client {
	
	public static void main(String[] args) {
		TransactionService transactionService = new TransactionService();
		//ask for the number of transactions using system.in
		//create an array of length
		//populate the array with the values using scanner class		
		int[] inputTransactions = new int[] {100, 200, 400, 500, 600,800,900,1000,2000,3000,40000};
		int target = 15000;
		transactionService.checkTransactionTarget(inputTransactions, target);
	}
}

