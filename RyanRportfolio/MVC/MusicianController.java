package student;

public class MusicianController {
	   private Musician model;
	   private MusicianView view;

	   public MusicianController(Musician model, MusicianView view){
	      this.model = model;
	      this.view = view;
	   }

	   public void setMusicianName(String name){
	      model.setName(name);		
	   }

	   public String getMusicianName(){
	      return model.getName();		
	   }

	   public void setMusicianRollNo(String rollNo){
	      model.setRollNo(rollNo);		
	   }

	   public String getMusicianRollNo(){
	      return model.getRollNo();		
	   }

	   public void updateView(){				
	      view.printMusicianDetails(model.getName(), model.getRollNo());
	   }	
	}
