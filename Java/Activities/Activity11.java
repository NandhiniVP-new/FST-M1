package activities;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create a Map named colours with integer keys and String values.
		Map<Integer, String> colours = new HashMap<>();
		
//		Add 5 random colours to it and print the Map to the console.
		colours.put(101, "Red");
		colours.put(102, "Blue");
		colours.put(103, "Grey");
		colours.put(104, "Violet");
		colours.put(105, "White");
		
		
		System.out.println(colours);		
		
		for(Entry<Integer, String> item:colours.entrySet()) {
			System.out.println(item.getKey() + ":" + item.getValue());
		}
		
	
//		Remove one colour using the remove() method.
		
     colours.remove("Grey"); 
		
//		Check if the colour green exists in the Map using the containsValue() method.
     System.out.println("Does White exist ? " + colours.containsValue("White"));
		
		
//		Print the size of the Map using the size() method.
     
     System.out.println("Size of the Map " + colours.size());
		
     
	}
		
	}
	


