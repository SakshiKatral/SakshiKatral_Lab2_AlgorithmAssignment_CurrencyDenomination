package com.ssk.learning.lab.currencydenominations;

import java.util.Scanner;

import com.ssk.learning.lab.service.NotesCount;

public class CurrencyDenominations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int sizeOfCurDen = scanner.nextInt();
		
		System.out.println("Enter the currency denomination values");
		int[] currencyDenomination = new int[sizeOfCurDen];
		
		for(int i = 0; i <  sizeOfCurDen; i++) {
			currencyDenomination[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay");
		int amount = scanner.nextInt();

		NotesCount notesCount = new NotesCount();
		notesCount.notesCounter(currencyDenomination, amount);
	}

}
