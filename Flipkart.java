
public class Flipkart {

		synchronized void order(String name)
		{
			System.out.println("ordered using "+name);
			try {
				
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			e.getMessage();	
			}
			System.out.println("Please wait your order is proccessing.....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("ordered successful using "+name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("==========================================");
			
		}
		

}
