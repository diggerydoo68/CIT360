package softwareDev;

import java.util.ArrayList;

public class collection {
	public static void main(String[] args){
		//using the arraylist class
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		System.out.println(numbers.get(0));
		
		System.out.println("\nInteration #1: ");
		//indexed for loop iteration
		for(int i=0; i < numbers.size(); i++){
			System.out.println(numbers.get(i));
		}
	public class collectiontwo{
		public void main(String[] args){
			ArrayList<String> hobbits = new ArrayList<String>();
			
			hobbits.add("Bilbo");
			hobbits.add("Frodo");
			hobbits.add("Sam");
			hobbits.add("Merry");
			hobbits.add("Pippin");
			hobbits.add("Took");
			hobbits.add("Olo");
			hobbits.add("Brandybuck");
	
		}
	}

}
