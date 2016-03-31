public class Musician extends Bands{
protected String description;
	
	Musician() {
		
	}
	
	Musician(String Instrument, String Genre, String description) {
		super(Instrument, Genre);
		this.description = description;
	}
	
	//to string is used to pull and print
	public String toString() {
		return " " + Instrument + ", " + Genre + ", " + description + " "; 
	}

}
