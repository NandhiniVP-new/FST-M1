package JavaActivities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        // Adding element to HashSet
        hs.add("One");
        hs.add("Two");
        hs.add("Three");
        hs.add("Four");
        hs.add("Five");
        hs.add("Six");
        
        //Print HashSet
        System.out.println("Original HashSet: " + hs);        
        //Print size of HashSet
        System.out.println("Size of HashSet: " + hs.size());
        
        //Remove element
        System.out.println("Removing One from HashSet: " + hs.remove("One"));
        //Remove element that is not present
        if(hs.remove("A")) {
        	System.out.println("A removed from the Set");
        } else {
        	System.out.println("A is not present in the Set");
        }
        
        //Search for element
        System.out.println("Checking if Six is present: " + hs.contains("Six"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}