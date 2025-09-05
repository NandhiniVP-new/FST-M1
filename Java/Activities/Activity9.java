package activities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create an ArrayList named myList of type String.
		List<String> strlList = new ArrayList<String>();
		
//		Add 5 names to the ArrayList using add() method.
		strlList.add("BMW");
		strlList.add("Audi");
		strlList.add("Kia");
		strlList.add(1, "Hyundai");
		strlList.add(0, "Tata");


//		Then print all the names using for loop.
		for(String name:strlList) {
			System.out.println(name);
		}
//		Then use get() method to retrieve the 3rd name in the ArrayList.
		Iterator<String> listItr = strlList.iterator();
		while (listItr.hasNext()) {
			System.out.println(listItr.next()); 
				
		}
		System.out.println("3rd Name is " + strlList.get(2) );
		
//		Use contains() method to check if a name exists in the ArrayList.
		System.out.println("Is Audi available in the list " + strlList.contains("Audi") );
//		Use size() method to print the number of names in the ArrayList.
		System.out.println("No. of elements in the list " + strlList.size() );
//		Use remove() method to remove a name from the list and print the size() of the list again.
		strlList.remove("BMW");
		System.out.println("No. of elements in the list after removing " + strlList.size() );
		

	}

}
