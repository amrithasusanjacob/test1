package rabbitmov;

public class rabbit {

	// -----------
	// PROPERTIES
	// -----------
	private int xPosition;
	private int yPosition;
	
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
	
	// ----------------
	// ACCESSOR METHODS
	// ----------------
	
	// Put all your accessor methods in this section.
	
}
