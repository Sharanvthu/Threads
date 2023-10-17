
public class tom extends Thread
{
	@Override
	synchronized public void run() 
	{
		for (int tom = 0; tom < 6; tom++) 
		{
			System.out.println("tom:"+tom);
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
