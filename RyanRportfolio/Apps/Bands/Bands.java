package order;

import java.util.Scanner;

public class Bands {
	public static void main(String[] args){
		
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("This is the drummers portal.");
		System.out.println("Give us a band and we will tell you more about them.");
		
		int drummerType = 0;
		boolean keepLooping = true;
		
		while (keepLooping)
		{
			System.out.print("Please enter a category number. Options are:"+'\n'+"Rock = 1"+'\n'+"Funk = 2"+'\n'+"Jazz = 3"+'\n'+"Blues = 4"+'\n'+"Metal = 5"+'\n'+"Latin = 6"+'\n'+"Pop = 7"+'\n'+"");
			drummerType = input.nextInt();

			switch (drummerType) {

			case 1:
				// Rock
				sayRock();
				keepLooping = false;
				break;

			case 2:
				// Funk
				sayFunk();
				keepLooping = false;
				break;
			
			case 3:
				// Jazz
				sayJazz();
				keepLooping = false;
				break;
				
			case 4:
				// Blues
				sayBlues();
				keepLooping = false;
				break;
				
			case 5:
				// Metal
				sayMetal();
				keepLooping = false;
				break;
				
			case 6:
				// Latin
				sayLatin();
				keepLooping = false;
				break;
				
			case 7:
				// Pop
				sayPop();
				keepLooping = false;
				break;

			default:
				System.out.print("\nPlease choose one of the genres.\n");

		}
	}

}
	// Genre Selection
	private static void sayRock() {

		// Create the scanner.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print(""+'\n'+"==============================="+'\n'+"Select a band for more info: "+'\n'+"Rush = 1,"+'\n'+"The Beatles = 2, "+'\n'+"Led Zeppelin = 3, "+'\n'+"Nirvana = 4, "+'\n'+"Mettalica = 5 "+'\n'+"");

		int band1 = 0;
		boolean keepLooping = true;

		while (keepLooping) {
			System.out.print("Select band: ");
			band1 = input.nextInt();

			switch (band1) {

			case 1:
				// Rush
				Bands Musician = new Musician("Neil Peart, Drummer","Rock", "Famous for gold cymbal stands.");
				keepLooping = false;
				System.out.print(" "+ Musician +""+'\n'+"Check out their website.");
				break;

			case 2:
				// The Beatles
				Bands Musician2 = new Musician("Ringo Starr, Drummer", "Rock", "They all are british.");
				keepLooping = false;
				System.out.print(" "+ Musician2 +""+'\n'+"Check out their website.");
				break;

			case 3:
				// Led Zeppelin
				Bands Musician3 = new Musician("John Bonham, Drummer", "Rock", "Most influential rock band ever.");
				keepLooping = false;
				System.out.print(" "+ Musician3 +""+'\n'+"Check out their website.");
				break;
				
			case 4:
				// Nirvana
				Bands Musician4 = new Musician("Dave Grohl, Drummer", "Rock", "Most insane drummer.");
				keepLooping = false;
				System.out.print(" "+ Musician4 +""+'\n'+"Check out their website.");
				break;
				
			case 5:
				// Mettalica
				Bands Musician5 = new Musician("lars Ulrich, Drummer", "Rock", "Most successful rock band ever.");
				keepLooping = false;
				System.out.print("/n" + Musician5 + "/nCheck out their website.");
				break;

			default:
				System.out.print("\nPlease either 1 or 2.\n");

			}
		}
	}

	// Genre Selection
		private static void sayFunk() {

			// Create the scanner.
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);

			System.out.print("\n Select a band for more info: The Famous Flames = 1,"+'\n'+"The Revolution = 2, "+'\n'+"Blue Matter Band = 3,"+'\n'+"Jay-Z = 4,"+'\n'+"Stevie Wonder = 5"+'\n'+"");

			int band1 = 0;
			boolean keepLooping = true;

			while (keepLooping) {
				System.out.print("Enter band: ");
				band1 = input.nextInt();

				switch (band1) {

				case 1:
					// James Brown
					Bands Musician = new Musician("James Brown, Drummer", "Funk, Soul", "The Godfather of Soul");
					keepLooping = false;
					System.out.print(" "+ Musician +""+'\n'+"Check out their website.");
					break;

				case 2:
					// The Prince
					Bands Musician1 = new Musician("Prince Rogers Nelson, Drummer, vocal, bass guitar", "Funk, Rock", "The Purple One.");
					keepLooping = false;
					System.out.print(" "+ Musician1 +""+'\n'+"Check out their website.");
					break;

				case 3:
					// Blue Matter Band
					Bands Musician2 = new Musician("Dennis Chambers, Drummer", "Funk", "Hall of fame drummer.");
					keepLooping = false;
					System.out.print(" "+ Musician2 +""+'\n'+"Check out their website.");
					break;
					
				case 4:
					// Jay-Z
					Bands Musician3 = new Musician("Tony Royster Jr., Drummer", "Funk", "Prodigy period");
					keepLooping = false;
					System.out.print(" "+ Musician3 +""+'\n'+"Check out their website.");
					break;
					
				case 5:
					// Stevie wonder
					Bands Musician4 = new Musician("Stevie Wonder, Pianist", "Funk, Soul", "Most loved music performer.");
					keepLooping = false;
					System.out.print(" "+ Musician4 +""+'\n'+"Check out their website.");
					break;

				default:
					System.out.print("\nPlease either 1 or 2.\n");

				}
			}
		}
		// Genre Selection
				private static void sayJazz() {

					// Create the scanner.
					@SuppressWarnings("resource")
					Scanner input = new Scanner(System.in);

					System.out.print("\n Select a band for more info:"+'\n'+"Louie Armstrong and his hot five = 1,"+'\n'+"Preservation Hall Jazz Band = 2, "+'\n'+"Weather Report = 3,"+'\n'+"Get the blessing = 4,"+'\n'+"The Bad Plus = 5"+'\n'+"");

					int band1 = 0;
					boolean keepLooping = true;

					while (keepLooping) {
						System.out.print("Enter band: ");
						band1 = input.nextInt();

						switch (band1) {

						case 1:
							// Louie Armstrong and his hot five
							Bands Musician = new Musician("Louie Armstrong, Trumpetist", "Jazz", "Known as Pops");
							keepLooping = false;
							System.out.print(" "+ Musician +""+'\n'+"Check out their website.");
							break;

						case 2:
							// Preservation hall Jazz Band
							Bands Musician1 = new Musician("Various musicians", "Jazz", "The French Quarter.");
							keepLooping = false;
							System.out.print(" "+ Musician1 +""+'\n'+"Check out their website.");
							break;

						case 3:
							// Weather Report
							Bands Musician2 = new Musician("Peter Erskin, drummer", "Jazz", "Best Large Jazz Ensemble.");
							keepLooping = false;
							System.out.print(" "+ Musician2 +""+'\n'+"Check out their website.");
							break;
							
						case 4:
							// Get the Blessing
							Bands Musician3 = new Musician("Clive Deamer, drummer", "Jazz", "Best Alblum 2008 BBC");
							keepLooping = false;
							System.out.print(" "+ Musician3 +""+'\n'+"Check out their website.");
							break;
							
						case 5:
							// The Bad Plus
							Bands Musician4 = new Musician("Dave King", "Jazz", "Founder of the bad plus.");
							keepLooping = false;
							System.out.print(" "+ Musician4 +""+'\n'+"Check out their website.");
							break;

						default:
							System.out.print("\nPlease either 1 or 2.\n");

						}
					}
				}
				// Genre Selection
				private static void sayBlues() {

					// Create the scanner.
					@SuppressWarnings("resource")
					Scanner input = new Scanner(System.in);

					System.out.print("\n Select a band for more info:"+'\n'+"John Mayer Trio = 1,"+'\n'+"The Who = 2, "+'\n'+"Jimmie Hendrix = 3,"+'\n'+"Adele = 4,"+'\n'+"The Paul Butterfield Blues Band = 5"+'\n'+"");

					int band1 = 0;
					boolean keepLooping = true;

					while (keepLooping) {
						System.out.print("Enter band: ");
						band1 = input.nextInt();

						switch (band1) {

						case 1:
							// Louie Armstrong and his hot five
							Bands Musician = new Musician("Steve Jordan, Drummer", "Blues", "JVC Victor");
							keepLooping = false;
							System.out.print(" "+ Musician +""+'\n'+"Check out their website.");
							break;

						case 2:
							// The Who
							Bands Musician1 = new Musician("Keith Moon, Drummer", "Blues, Rock", "Voted the second greatest drummer in history.");
							keepLooping = false;
							System.out.print(" "+ Musician1 +""+'\n'+"Check out their website.");
							break;

						case 3:
							// Jimmie Hendrix
							Bands Musician2 = new Musician("Jimmie Hendrix, guitarist and vocals", "Blues, Rock", "Most influential Electric Guitarist.");
							keepLooping = false;
							System.out.print(" "+ Musician2 +""+'\n'+"Check out their website.");
							break;
							
						case 4:
							// Adele
							Bands Musician3 = new Musician("Adele, Vocals", "Blues, Soul, Pop", "Golden Globe for best original song.");
							keepLooping = false;
							System.out.print(" "+ Musician3 +""+'\n'+"Check out their website.");
							break;
							
						case 5:
							// The Paul Butterfield Blues Band
							Bands Musician4 = new Musician("Billy Davenport, Drummer", "Blues", "Inducted into the Rock and Roll Hall of Fame.");
							keepLooping = false;
							System.out.print(" "+ Musician4 +""+'\n'+"Check out their website.");
							break;

						default:
							System.out.print("\nPlease either 1 or 2.\n");

						}
					}
				}
				// Genre Selection
				private static void sayMetal() {

					// Create the scanner.
					@SuppressWarnings("resource")
					Scanner input = new Scanner(System.in);

					System.out.print("\n Select a band for more info:"+'\n'+"Slayer = 1,"+'\n'+"Dream Theater = 2, "+'\n'+"Slipknot = 3,"+'\n'+"Iron Maiden = 4,"+'\n'+"Van Halen = 5"+'\n'+"");

					int band1 = 0;
					boolean keepLooping = true;

					while (keepLooping) {
						System.out.print("Enter band: ");
						band1 = input.nextInt();

						switch (band1) {

						case 1:
							// Slayer
							Bands Musician= new Musician("Dave Lombardo, Drummer", "Metal", "The Godfather of Double Bass");
							keepLooping = false;
							System.out.print(" "+ Musician +""+'\n'+"Check out their website.");
							break;

						case 2:
							// Dream Theater
							Bands Musician1 = new Musician("Mike Portnoy, Drummer", "Metal", "Best Rock Drummer.");
							keepLooping = false;
							System.out.print(" "+ Musician1 +""+'\n'+"Check out their website.");
							break;

						case 3:
							// Slipknot
							Bands Musician2 = new Musician("Joey Jordison, drummer", "Metal", "Known as Scarecrow.");
							keepLooping = false;
							System.out.print(" "+ Musician2 +""+'\n'+"Check out their website.");
							break;
							
						case 4:
							// Adele
							Bands Musician3 = new Musician("Nicko McBrain, drummer", "Metal", "Winner of Ivor Norvello Award.");
							keepLooping = false;
							System.out.print(" "+ Musician3 +""+'\n'+"Check out their website.");
							break;
							
						case 5:
							// Van Halen
							Bands Musician4 = new Musician("Alex Van Halen, Drummer", "Metal", "Played keyboard for Twister movie.");
							keepLooping = false;
							System.out.print(" "+ Musician4 +""+'\n'+"Check out their website.");
							break;

						default:
							System.out.print("\nPlease either 1 or 2.\n");

						}
					}
				}
				
				// Genre Selection
				private static void sayLatin() {

					// Create the scanner.
					@SuppressWarnings("resource")
					Scanner input = new Scanner(System.in);

					System.out.print("\n Select a band for more info:"+'\n'+"Leaonard Gibbs = 1,"+'\n'+"Lenny Castro = 2, "+'\n'+"Phil Maturano = 3,"+'\n'+"Efrain Toro = 4,"+'\n'+"Big Phat Band = 5"+'\n'+"");

					int band1 = 0;
					boolean keepLooping = true;

					while (keepLooping) {
						System.out.print("Enter band: ");
						band1 = input.nextInt();

						switch (band1) {

						case 1:
							// Slayer
							Bands Musician= new Musician("Leaonard Gibbs, Drummer", "Latin", "Also Known as Doc.");
							keepLooping = false;
							System.out.print(" "+ Musician +""+'\n'+"Check out their website.");
							break;

						case 2:
							// Dream Theater
							Bands Musician1 = new Musician("Lenny Castro, Drummer", "Latin", "Most in demand Percussionist.");
							keepLooping = false;
							System.out.print(" "+ Musician1 +""+'\n'+"Check out their website.");
							break;

						case 3:
							// Slipknot
							Bands Musician2 = new Musician("Phil Maturano, drummer", "Latin", "Graduated at Musicians Institute - P.I.T.");
							keepLooping = false;
							System.out.print(" "+ Musician2 +""+'\n'+"Check out their website.");
							break;
							
						case 4:
							// Adele
							Bands Musician3 = new Musician("Efrain Toro, drummer", "Latin", "Most well rounded drummers in the world.");
							keepLooping = false;
							System.out.print(" "+ Musician3 +""+'\n'+"Check out their website.");
							break;
							
						case 5:
							// Van Halen
							Bands Musician4 = new Musician("Luis Conte, Drummer", "Latin", "Able to integrate cuban music with American music.");
							keepLooping = false;
							System.out.print(" "+ Musician4 +""+'\n'+"Check out their website.");
							break;

						default:
							System.out.print("\nPlease make a selection.\n");

						}
					}
				}
				// Genre Selection
				private static void sayPop() {

					// Create the scanner.
					@SuppressWarnings("resource")
					Scanner input = new Scanner(System.in);

					System.out.print("\n Select a band for more info:"+'\n'+"Blink-182 = 1,"+'\n'+"Coldplay = 2, "+'\n'+"Queen = 3,"+'\n'+"The Script = 4,"+'\n'+"U2 = 5"+'\n'+"");

					int band1 = 0;
					boolean keepLooping = true;

					while (keepLooping) {
						System.out.print("Enter band: ");
						band1 = input.nextInt();

						switch (band1) {

						case 1:
							// Slayer
							Bands Musician= new Musician("Travis Barker, Drummer", "Pop Rock", "Punks first superstar drummer.");
							keepLooping = false;
							System.out.print(" "+ Musician +""+'\n'+"Check out their website.");
							break;

						case 2:
							// Dream Theater
							Bands Musician1 = new Musician("Christ Martin, Pianist", "Pop", "Used to be a vegan.");
							keepLooping = false;
							System.out.print(" "+ Musician1 +""+'\n'+"Check out their website.");
							break;

						case 3:
							// Slipknot
							Bands Musician2 = new Musician("Freddie Mecury, Vocalist", "Pop", "Known for his four-octave vocal range.");
							keepLooping = false;
							System.out.print(" "+ Musician2 +""+'\n'+"Check out their website.");
							break;
							
						case 4:
							// Adele
							Bands Musician3 = new Musician("Glen Power, Drummer", "Pop", "Came from a family of musicians.");
							keepLooping = false;
							System.out.print(" "+ Musician3 +""+'\n'+"Check out their website.");
							break;
							
						case 5:
							// Van Halen
							Bands Musician4 = new Musician("Larry Mulin Jr., Drummer", "Pop", "Has been acting in movies as well.");
							keepLooping = false;
							System.out.print(" "+ Musician4 +""+'\n'+"Check out their website.");
							break;

						default:
							System.out.print("\nPlease make a selection.\n");

						}
					}
				}
				protected String Instrument;
				protected String Genre;
				
				// Default or no arg constructor
				public Bands() {
						
				}
				
				// Primary constructor
				public Bands(String Instrument, String Genre) {
					this.Instrument = Instrument;
					this.Genre = Genre;
				}
				
				// Getters for CustOrder
				public String getFoodItem() {
					return Instrument;
				}
				
				public String getOrderType() {
					return Genre;
				}
				
				// Setters for CustOrder
				public void setFoodItem(String Instrument) {
					this.Instrument = Instrument;
				}
				
				public void setOrderType(String Genre) {
					this.Genre = Genre;
				}
				
				//to string is used to pull and print
				public String toString() {
					return "[" +Instrument + "][" + Genre + "]";
				}
}
