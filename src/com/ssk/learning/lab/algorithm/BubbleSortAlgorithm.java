package com.ssk.learning.lab.algorithm;

public class BubbleSortAlgorithm {

	public void bubbleSort(int[] array) {
		int temp;
		
		for(int i = 0; i < array.length; i++){
			for(int j = 1; j < (array.length - i); j++){
				if(array[j - 1] < array[j]){
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}
