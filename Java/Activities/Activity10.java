package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create a HashSet named hs.
		Set<Integer> numSet = new HashSet<Integer>();
//		Add 6 objects using add() method to the HashSet.
		numSet.add(100);
		numSet.add(20909);
		numSet.add(2321);
		numSet.add(2232454);
		numSet.add(2324);
		numSet.add(3333);
//		Then print the size of the HashSet using the size() method.
		for(int num : numSet) {
			System.out.println(num);
		}
		System.out.println("Size of the set : " + numSet.size());
//		Remove an element using the remove() method.
		numSet.remove(100);
		System.out.println("Removed value 100.");
		
		System.out.println("Size of the set : " + numSet.size());
		System.out.println(numSet);
//		Also try to remove an element that is not present in the Set.
		if (numSet.remove(10)) {
			System.out.println("Removed value 10.");
		}else
		{
			System.out.println("Value doesnt exist.");
		}
		
//		Use the contains() method to check if an item is in the Set or not.
//		Print the updated set.
		System.out.println("Search for 20909? " + numSet.contains(20909));
		System.out.println(numSet);
//	
		}

}
