package rabbitmov;

public class rabbit {

	// -----------
	// PROPERTIES
	// -----------
	private int xPosition;
	private int yPosition;
	// ----------------
		// ACCESSOR METHODS
		// ----------------
		
		// Put all your accessor methods in this section.
	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	
	// -----------
	// CONSTRUCTOR 
	// ------------
	public rabbit(int xp,int yp) {
     this.xPosition=xp;
     this.yPosition=yp;
	}
	
	// -----------
	// METHODS 
	// ------------
	public void printCurrentPosition() {
		System.out.println("The current position of the rabbit is: ");
	}

	public void sayHello() {
		System.out.println("Hello! I am a rabbit!");
	}
	
	
	
}
