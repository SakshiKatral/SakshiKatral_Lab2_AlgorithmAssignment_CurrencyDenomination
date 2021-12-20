package com.ssk.learning.lab.service;

import com.ssk.learning.lab.algorithm.BubbleSortAlgorithm;

public class NotesCount {

	public void notesCounter(int[] notes, int amount) {
		int[] noteCounter = new int[notes.length];
		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		bubbleSortAlgorithm.bubbleSort(notes);
		
		for(int i = 0; i < notes.length; i++) {
			if(amount >= notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount % notes[i];
//				amount = amount - noteCounter[i] * notes[i];
			}
		}
		
		if(amount > 0) {
			System.out.println("Exact amount can't be given with the higest denomination");
		}
		else {
			System.out.println("Your Payment approach is");
			
			for(int i = 0; i < notes.length; i++) {
				if(noteCounter[i] != 0) {
					System.out.println(notes[i] + " : " + noteCounter[i]);
				}
			}
		}
	}
}
