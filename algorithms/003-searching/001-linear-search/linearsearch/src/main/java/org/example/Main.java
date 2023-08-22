package org.example;

public class Main {
	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		linearSearch(intArray, -15);
		linearSearch(intArray, 1);
		linearSearch(intArray, 8888);
		linearSearch(intArray, -22);

	}

	public static void linearSearch(int[] input, int value) {
		int allValues = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == value) {
				System.out.println(i);
			} else {
				allValues += 1;
			}
		}
		if(allValues == input.length){
			System.out.println("Item not found");
		}
	}
}