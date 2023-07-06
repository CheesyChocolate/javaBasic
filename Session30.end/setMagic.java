/** consider a system of sets with elements of 0 and 1
  * each set has 100 elements
  * the constructor sets all elements to 0
  * the method FillSets() fill the elements of a set randomly
  * the mrthod ElementsOfTheSet() prints the elements of a set
  * the method Intersection() calculates the intersection of two sets
  * the method Intersection() prints index of the sets that have the same elements
  * the method Union() calculates the union of two sets
  * the method Union() prints index of the sets that have the same elements
  * the mrthod get_element() to read the elements of a set
  */

import java.util.Random;

public class setMagic {
	public static void main(String[] Args) {
		// create a system of sets
		Sets set1 = new Sets();
		Sets set2 = new Sets();
		// print the elements of the sets
		System.out.println("Elements of the set1:");
		set1.ElementsOfTheSet();
		System.out.println("Elements of the set2:");
		set2.ElementsOfTheSet();
		// fill the sets randomly
		set1.FillSets();
		set2.FillSets();
		// print the elements of the sets
		System.out.println("Elements of the set1:");
		set1.ElementsOfTheSet();
		System.out.println("Elements of the set2:");
		set2.ElementsOfTheSet();
		// calculate the intersection of the sets
		set1.Intersection(set2);
		// calculate the union of the sets
		set1.Union(set2);
	}
}

class Sets {
	int[] set = new int[100];
	Random rand = new Random();

	public Sets() {
		for (int i = 0; i < 100; i++) {
			set[i] = 0;
		}
	}

	public void FillSets() {
		for (int i = 0; i < 100; i++) {
			set[i] = rand.nextInt(2);
		}
	}

	public void ElementsOfTheSet() {
		for (int i = 0; i < 100; i++) {
			System.out.print(set[i] + " ");
		}
		System.out.println();
	}

	public void Intersection(Sets otherSet) {
		int[] intersection = new int[100];
		for (int i = 0; i < 100; i++) {
			if (set[i] == 1 && otherSet.get_element(i) == 1) {
				intersection[i] = 1;
			}
		}
		System.out.println("Intersection of the sets:");
		for (int i = 0; i < 100; i++) {
			System.out.print(intersection[i] + " ");
		}
		System.out.println();
	}

	public void Union(Sets otherSet) {
		int[] union = new int[100];
		for (int i = 0; i < 100; i++) {
			if (set[i] == 1 || otherSet.get_element(i) == 1) {
				union[i] = 1;
			}
		}
		System.out.println("Union of the sets:");
		for (int i = 0; i < 100; i++) {
			System.out.print(union[i] + " ");
		}
		System.out.println();
	}

	public int get_element(int i) {
		return set[i];
	}
}
