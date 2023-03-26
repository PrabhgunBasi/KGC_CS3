package assesments;

import java.util.ArrayList;

public class Assesment1 {
	public static ArrayList<Integer> removeEven(ArrayList<Integer> arr) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) % 2 == 0) {
				arr.remove(i);
			}
		}
		return arr;
	}

	public static void findAddends(ArrayList<Integer> arr, int sum) {
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i) + arr.get(j) == sum) {
					System.out.println("The two numbers that add up to "+sum+" are: " + arr.get(i) + " and " + arr.get(j));
				}
			}
		}
	}

	public static ArrayList<Integer> selectionSort(ArrayList<Integer> arr) {
		for (int i = 0; i < arr.size(); i++) {
			int smallest = i;
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(j) < arr.get(smallest)) {
					smallest = j;
				}
			}
			int temp = arr.get(i);
			arr.set(i, arr.get(smallest));
			arr.set(smallest, temp);
		}
		return arr;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(-4);
		arr.add(-5);
		arr.add(1);
		arr.add(5);
		arr.add(6);
		arr.add(2);
		arr.add(-2);
		arr.add(-3);
		arr.add(3);
		arr.add(-1);
		arr.add(4);
		System.out.println(removeEven(arr));
		findAddends(arr, 8);
		System.out.println(selectionSort(arr));

	}

}
