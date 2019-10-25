package animalExample;

public class Animal {
	
	private String breathe;
	private String eat;
	private boolean liveOnEarth;
	
	//no-arg constructor
	public Animal () {
		
	}

	public void setLiveOnEarth(boolean liveOnEarth) {
		this.liveOnEarth = liveOnEarth;
	}

	//Constructor with all Arguments
	public Animal (String breathe, String eat, boolean liveOnEarth) {
		this.breathe = breathe;
		this.eat = eat;
		this.liveOnEarth = true;
	}

	//Getters and Setters
	public String getBreathe() {
		return breathe;
	}

	public void setBreathe(String breathe) {
		this.breathe = breathe;
	}

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

	public boolean isLiveOnEarth() {
		return liveOnEarth;
	}
	
	//Methods
	public boolean getBreathe(boolean yesOrNo) {
		return yesOrNo;
	} 
	
	

}
