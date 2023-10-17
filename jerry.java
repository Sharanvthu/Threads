
public class jerry extends Thread
{
	@Override
synchronized	public void run() 
	{
		for (int jerry = 6; jerry < 11; jerry++) 
		{
			System.out.println("jerry:"+jerry);
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
