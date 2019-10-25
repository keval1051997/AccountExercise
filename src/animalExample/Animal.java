package animalExample;

public class Animal {
	
	//if private, you can only call it in this class, Animal
	//With protected: its accessible to all classes within the animalExample package
	protected String breathe;
	protected String eat;
	protected boolean liveOnEarth;
	
	//no-arg constructor
	public Animal () {
		
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
	
	public void liveOnEarthConstruct(boolean liveOnEarth) {
		this.liveOnEarth = liveOnEarth;
	}
	
	
	//Methods
	public String getBreathe(boolean yesOrNo) {
		if (yesOrNo == true) {
			return "Yes, " + "The animal can breathe";
		} else {
			return "No, " + "The animal cannot breathe....:C";
		}
		
	} 
	
	//Get value of inputs for 3 attributes
	public String value() {
		return "Animal breathe " + breathe + "\n"
				+ "Animal eats" + eat + "\n"
				+ "Animal live on Earth? True or False: " + liveOnEarth;
	}
	
	

}
