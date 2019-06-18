package rabbitmov;

public class main {
	public static void main(String[] args) throws InterruptedException {
		rabbit rabbit = new rabbit(250,0);
		rabbit.sayHello();
		boolean runForever = true;
		while (runForever == true) {
			Thread.sleep(1000);
			int xp = rabbit.getxPosition();
			System.out.println("The rabbit is at pos "+xp);
			rabbit.setxPosition(xp-15);
		}
}
}
