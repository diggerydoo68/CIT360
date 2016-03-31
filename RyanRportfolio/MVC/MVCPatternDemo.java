public class MVCPatternDemo {
	   public static void main(String[] args) {

	      //fetch musician record based on his roll no from the database
	      Musician model  = retriveMusicianFromDatabase();

	      //Create a view : to write musician details on console
	      MusicianView view = new MusicianView();

	      MusicianController controller = new MusicianController(model, view);

	      controller.updateView();

	      //update model data
	      controller.setMusicianName("Neil");

	      controller.updateView();
	   }

	   private static Musician retriveMusicianFromDatabase(){
	      Musician musician = new Musician();
	      musician.setName("Peart");
	      musician.setRollNo("10");
	      return musician;
	   }
	}
