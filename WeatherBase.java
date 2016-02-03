// Author: Kyle Stucki 2/1/2016
// CIT 360 - Collections

// We will be using all of these libraries so lets import them
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// This is our driver class WeatherBase
public class WeatherBase {

	// Main
	public static void main(String[] args) {
		
		// Create temporary temperature holders
		float t1 = 0;
		float t2 = 0;
		float t3 = 0;
		float t4 = 0;
		float t5 = 0;
		
		// Create the scanner for input.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Prompt for input
		System.out.print("Please enter some temperatures in ºF\n");
		System.out.print("Temperature 1: ");
		t1 = input.nextFloat();
		System.out.print("Temperature 2: ");
		t2 = input.nextFloat();
		System.out.print("Temperature 3: ");
		t3 = input.nextFloat();
		System.out.print("Temperature 4: ");
		t4 = input.nextFloat();
		System.out.print("Temperature 5: ");
		t5 = input.nextFloat();

		// Create our list we are going to use
		List<Float> tempList = new ArrayList<Float>();
		
		// Add the temporary temperature holders into the list we made
		tempList.add(t1);
		tempList.add(t2);
		tempList.add(t3);
		tempList.add(t4);
		tempList.add(t5);
		
		// Display to the user the temperatures they provided
		System.out.print("\nHere are the values you entered in: ");
		System.out.println(tempList + "\n");
		
		// We begin using Collections *Note we known this because before every method is called
		// the word Collection.method() appears. Interesting.
		
		// Collections Example 1 - sort the list in ascending order
		Collections.sort(tempList);
		System.out.println("Sorted Temperatures - Low to High: " + tempList + "\n");
		
		// Collections Example 2 - shuffle the list so its random again
		Collections.shuffle(tempList);
		System.out.println("Shuffled Temperatures - Much random Very Wow: " + tempList + "\n");
		Collections.shuffle(tempList);
		System.out.println("Shuffled Temperatures - Much random Very Wow: " + tempList + "\n");
		
		// Collections Example 3 - searching the list
		// We need to sort before we search it. Very important or it won't work!
		Collections.sort(tempList);
		
		// Prompt for a temperature
		float tempLookup = 0;
		System.out.println("Temperature lookup: ");
		tempLookup = input.nextFloat();
		
		// Search the list for the provided temperature to lookup and report back
		int search = Collections.binarySearch(tempList, tempLookup);
		
		// If the search worked look for positive number, else negative = fail
		if(search >= 0){
			System.out.println("Temperature found. [" + tempLookup + "]\n");
		}
		else{
		    System.out.println("Temperature not found. [" + tempLookup + "]\n");
		}
		
		// Collections Example 4 - Get the min temp from the list
		Float minimum = Collections.min(tempList);
		System.out.println("Minimum temperature is: [" + minimum + "]\n");
		
		// Collections Example 5 - Get the max temp from the list
		Float maximum = Collections.max(tempList);
		System.out.println("Maximum temperature is: [" + maximum + "]\n");
		
		// Collections Example 6 - Reverse the list around
		System.out.println("List Before - Current List: " + tempList);
		Collections.reverse(tempList);
		System.out.println("List After - Reversed List: " + tempList + "\n");
		
		// Collections Example 7 - filling the list 
		float zeroOut = 0;
		Collections.fill(tempList, zeroOut);
		System.out.println("Wipe it clean - Filled List: "+ tempList);
				
		// Collections Example 8 - Replaces one specified value in a list with another.
		float par1 = (float) 0.0;
		float par2 = (float) 56.23;
		Collections.replaceAll(tempList, par1, par2);
		System.out.println("Fill it up - After Replace: "+tempList + "\n");
		
		//Copy elements from one list to another
		List<Float> newTempList = new ArrayList<Float>(tempList.size());
		
		newTempList.add((float) 13.6);
		newTempList.add((float) 10.2);
		newTempList.add((float) 42.9);
		newTempList.add((float) 34.4);
		newTempList.add((float) 27.2);
		
		// Show the list before a copy takes place. Make the copy. Then display
		System.out.println("New temp list before copy: "+ newTempList);
		Collections.copy(newTempList, tempList);
		System.out.println("New temp list after copy: "+ newTempList + "\n");
		
		// Show both of our lists
		System.out.println("tempList: "+ tempList);
		System.out.println("newTempList: "+ newTempList + "\n");
		
		// End
		System.out.println("End of program reached. Goodbye.");
	}
}
