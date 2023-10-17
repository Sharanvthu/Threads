
public class paymentGateway extends Thread {
	String name;
	int n;
	amazon a;
	Flipkart f;
	public paymentGateway(String name,Flipkart f) {
		this.name = name;
		
		this.f=f;
	}
	public paymentGateway(String name, amazon a) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.name=name;
	}
	public paymentGateway(int n) {
		this.n=n;
	}
	@Override
	public void run() {
		a.order(name);
		
		
	}

}
