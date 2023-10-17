
public class main {

	public static void main(String[] args) {
		amazon A=new amazon();
	
		Flipkart F=new Flipkart();



		paymentGateway p1= new paymentGateway("phonepay",A);
		
		
		paymentGateway p2= new paymentGateway("googlepay", A);
		
		paymentGateway p3= new paymentGateway("paytm", A);
		
		 p1.setPriority(1);
		 
		 p2.setPriority(1);
		 
		 p3.setPriority(1);
		
		p1.start();
		
		p2.start();
		
		p3.start();
		
		

	}

}
