package animalExample;

//Inheritance: Dog will now have Animal's Attributes
public class Dog extends Animal {
	
	private String fur;
	private String bark;
	private String collarColor;
	
	//no-arg constructor
	public Dog() {
		
	}
	
	//Dog inherits Animal's attributes of breathing, eating, and existing on the Earth.
	public Dog(String breathe, String eat, boolean liveOnEarth, String fur, String bark, String collarColor) {
		super(breathe, eat, liveOnEarth);
		this.fur = fur;
		this.bark = bark;
		this.collarColor = collarColor;
	}
	
	//Getters and Setters
	public String getFur() {
		return fur;
	}

	public void setFur(String fur) {
		this.fur = fur;
	}

	public String getBark() {
		return bark;
	}

	public void setBark(String bark) {
		this.bark = bark;
	}

	public String getCollarColor() {
		return collarColor;
	}

	public void setCollarColor(String collarColor) {
		this.collarColor = collarColor;
	}
	
	//Methods
	public String getFurSoftness(String furtype) {
		return "Fur Softness: " + furtype;
	}
	
	public String value() {
		return 
				"can animal breath:"+ breathe + "\n"
				+ "What does animals eat:" + eat + "\n"
				+ "Does they live on this Earth:" + liveOnEarth + "\n"
				+ "Softness of fur:" + fur + "\n"
				+ "Bark sound:" + bark+ "\n"
				+ "Collar Color:" + collarColor;
	}

}
