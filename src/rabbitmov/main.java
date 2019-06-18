package rabbitmov;

public class main {
	public static void main(String[] args) throws InterruptedException {
		rabbit rabbit = new rabbit(250,0);
		rabbit.sayHello();
		
		
		boolean runForever = true;

		while (runForever == true) {
			System.out.println("Carrot");
			Thread.sleep(3000);
		}
}
}
