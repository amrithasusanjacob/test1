package rabbitmov;

public class main {
	public static void main(String[] args) throws InterruptedException {
		rabbit rabbit = new rabbit(250,0);
		rabbit.sayHello();
		boolean runForever = true;
		int t=0;
		rabbit.printCurrentPosition();
		while (runForever == true) {
			Thread.sleep(1000);
			int xp = rabbit.getxPosition();
			if(t==0)
			{
				  if(xp>10)
				   {
				    rabbit.setxPosition(xp-15);
				    rabbit.printCurrentPosition();
				   }
				  else
				   {
					t=1;
				   }
			    	   
			}
			else
	    	{
	    		rabbit.setxPosition(xp+15);
	    		rabbit.printCurrentPosition();
			}
			
		}
}
}
