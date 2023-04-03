package com.gllearning.client;
import java.util.*;
import java.lang.*;

public class Client {
	
	public static void countCurrency(int amount)
	{
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter the size of currency denominations");
		int size = s.nextInt();
		int notes[] = new int[size];
		System.out.println("Enter the currency denominations value"); 
		for (int i = 0; i < size; i++) {
			notes[i] = s.nextInt();
		}
		int temp = 0;    //Temporary variable to store the element
        
        for (int i = 0; i < notes.length; i++)   //Holds each Array element
        {     
           for (int j = i+1; j < notes.length; j++)    //compares with remaining Array elements
           {     
              if(notes[i] < notes[j]) //Compare and swap
              {    
                  temp = notes[i];    
                  notes[i] = notes[j];    
                  notes[j] = temp;    
              }     
           }     
       }
        
//        for (int i = 0; i < notes.length; i++) 
//        {     
//            System.out.print(notes[i] + " ");    
//        } 
        
		int[] noteCounter = new int[notes.length];

		for (int i = 0; i < noteCounter.length; i++) {
			if (amount >= notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount % notes[i];
			}
		}

		// Print notes
		System.out.println("Your payment approach in order to give min no of notes will be ::");
		for (int i = 0; i < noteCounter.length; i++) {
			if (noteCounter[i] != 0) {
				System.out.println(notes[i] + " : "+ noteCounter[i]);
			}
		}
	}

	public static void main(String args[]) throws Exception{
		System.out.println("Enter the amount you want to pay");
		Scanner sc =new Scanner(System.in);
		int amount = sc.nextInt();
		countCurrency(amount);
	}

}
