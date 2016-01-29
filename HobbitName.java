package softwareDev;

import java.util.ArrayList;

public class HobbitName {
	ArrayList<String> hobbits = new ArrayList<String>();
	
	public HobbitName() // add 20 entities to the collection ArrayList
	{
		hobbits.add("Bilbo"); //Methods
		hobbits.add("Frodo");
		hobbits.add("Sam");
		hobbits.add("Merry");
		hobbits.add("Pippin");
		hobbits.add("Took");
		hobbits.add("Olo");
		hobbits.add("Brandybuck");
		hobbits.add("Gotchalk");
		hobbits.add("Pleater");
		hobbits.add("Gandalf");
		hobbits.add("Sauran");
	}
	
	public String getQuote()
	{
		int i = (int) (Math.random() * hobbits.size());
		return hobbits.get(i); // display all twenty items in collection
	}

}
